package exercise;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.*;
import java.awt.*;

public class MyWindowTest {

    private MyWindow window;
    private JButton clearButton;
    private JTextArea textArea;

    @BeforeEach
    public void setUp() {
        // Ensure GUI components are created in the Event Dispatch Thread
        try {
            SwingUtilities.invokeAndWait(() -> {
                window = new MyWindow("Test", 100, 100);
                clearButton = (JButton) findComponentByType(window, JButton.class);
                textArea = (JTextArea) findComponentByType(window, JTextArea.class);
            });
        } catch (Exception e) {
            fail("Exception in setting up the window: " + e.getMessage());
        }
    }

    @Test
    public void testClearButtonClearsText() {
        // Simulate user typing text
        SwingUtilities.invokeLater(() -> {
            textArea.setText("Some text");

            // Simulate button click
            clearButton.doClick();

            // Assert text area is cleared
            assertEquals("", textArea.getText());
        });
    }

    private Component findComponentByType(Container container, Class<?> cls) {
        if (cls.isInstance(container)) {
            return container;
        }
        for (Component comp : container.getComponents()) {
            Component found = findComponentByType((Container) comp, cls);
            if (found != null) {
                return found;
            }
        }
        return null;
    }
}
