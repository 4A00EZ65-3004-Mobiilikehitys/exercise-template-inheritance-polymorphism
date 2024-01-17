package exercise.displaydevice;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for Pixel.
 */
public class PixelTest {

    @Test
    public void testSetColorValid() {
        Pixel pixel = new Pixel();
        pixel.setColor("red");
        assertEquals("Color should be set to red", "red", pixel.getColor());

        pixel.setColor("blue");
        assertEquals("Color should be set to blue", "blue", pixel.getColor());

        pixel.setColor("yellow");
        assertEquals("Color should be set to yellow", "yellow", pixel.getColor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetColorInvalid() {
        Pixel pixel = new Pixel();
        pixel.setColor("green"); // Should throw IllegalArgumentException
    }

    @Test
    public void testToString() {
        Pixel pixel = new Pixel();
        pixel.setX(5); // Assuming setters from Point class
        pixel.setY(10);
        pixel.setColor("red");
        String expected = "x = 5, y = 10, color = red";
        assertEquals("toString should return correct representation",
                     expected, pixel.toString());
    }
}
