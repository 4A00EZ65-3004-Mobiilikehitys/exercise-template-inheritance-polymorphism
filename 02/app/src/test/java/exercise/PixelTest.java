package exercise.displaydevice;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for Pixel.
 */
public class PixelTest {

    @Test
    public void testDefaultConstructor() {
        Pixel pixel = new Pixel();
        assertEquals("Default color should be null", null, pixel.getColor());
        assertEquals("Default X coordinate should be 0", 0, pixel.getX());
        assertEquals("Default Y coordinate should be 0", 0, pixel.getY());
    }

    @Test
    public void testParameterizedConstructor() {
        Pixel pixel = new Pixel(10, 20, "red");
        assertEquals("X coordinate should be 10", 10, pixel.getX());
        assertEquals("Y coordinate should be 20", 20, pixel.getY());
        assertEquals("Color should be red", "red", pixel.getColor());
    }

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
        Pixel pixel = new Pixel(5, 10, "red");
        String expected = "x = 5, y = 10, color = red";
        assertEquals("toString should return correct representation",
                     expected, pixel.toString());
    }

    // Testing the print method is more complex due to console output.
    // It's often not necessary unless the method involves complex logic.
}
