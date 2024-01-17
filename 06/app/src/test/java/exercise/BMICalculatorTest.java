package exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;

public class BMICalculatorTest {

    private BMICalculator calculator;
    private JTextField weightField;
    private JTextField heightField;
    private JButton calculateButton;

    @BeforeEach
    public void setUp() {
        try {
            SwingUtilities.invokeAndWait(() -> {
                calculator = new BMICalculator();
                weightField = (JTextField) findComponentByType(calculator, JTextField.class, "weightField");
                heightField = (JTextField) findComponentByType(calculator, JTextField.class, "heightField");
                calculateButton = (JButton) findComponentByType(calculator, JButton.class, "calculateButton");
            });
        } catch (Exception e) {
            fail("Exception in setting up the calculator: " + e.getMessage());
        }
    }

    @Test
    public void testBMI_Calculation() {
        SwingUtilities.invokeLater(() -> {
            weightField.setText("70");
            heightField.setText("1.75");
            calculateButton.doClick();
        });
    }

    private Component findComponentByType(Container container, Class<?> cls, String fieldName) {
        if (cls.isInstance(container)) {
            return container;
        }
        for (Component comp : container.getComponents()) {
            if (comp.getClass() == cls) {
                try {
                    Field field = BMICalculator.class.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    if (field.get(calculator) == comp) {
                        return comp;
                    }
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            if (comp instanceof Container) {
                Component found = findComponentByType((Container) comp, cls, fieldName);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }
}
