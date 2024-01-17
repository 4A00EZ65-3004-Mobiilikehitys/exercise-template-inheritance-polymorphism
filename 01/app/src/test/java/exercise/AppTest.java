package exercise;

import exercise.coordinate.Point;
import exercise.displaydevice.Pixel;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Test class for the App class.
 */
public class AppTest {

   @Test
    public void testCreatePoint() {
        Point point = App.createPoint();
        assertEquals("X coordinate should be 5", 5, point.getX());
        assertEquals("Y coordinate should be 5", 5, point.getY());
    }

    @Test
    public void testCreatePixel() {
        Pixel pixel = App.createPixel();
        assertEquals("X coordinate should be 5", 5, pixel.getX());
        assertEquals("Y coordinate should be 5", 5, pixel.getY());
        assertEquals("Color should be red", "red", pixel.getColor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetColorInvalid() {
        Pixel pixel = new Pixel();
        pixel.setColor("hotpink"); // Should throw IllegalArgumentException
    }

    @Test
    public void testSetColorValid() {
        Pixel pixel = new Pixel();
        pixel.setColor("blue"); // Valid color
        assertEquals("Color should be blue", "blue", pixel.getColor());
    }
}
