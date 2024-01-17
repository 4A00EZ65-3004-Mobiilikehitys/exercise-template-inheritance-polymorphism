package exercise.displaydevice;

import exercise.coordinate.Point;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for Pixel.
 */
public class PixelTest {

    @Test
    public void testDefaultConstructor() {
        Pixel pixel = new Pixel();
        assertEquals("Default X should be 0", 0, pixel.getX());
        assertEquals("Default Y should be 0", 0, pixel.getY());
        assertNull("Default color should be null", pixel.getColor());
    }

    @Test
    public void testParameterizedConstructor() {
        Pixel pixel = new Pixel(5, 10, "red");
        assertEquals("X should be 5", 5, pixel.getX());
        assertEquals("Y should be 10", 10, pixel.getY());
        assertEquals("Color should be 'red'", "red", pixel.getColor());
    }

    @Test
    public void testSettersAndGetters() {
        Pixel pixel = new Pixel();
        pixel.setX(3);
        pixel.setY(4);
        pixel.setColor("blue");
        assertEquals("X should be 3", 3, pixel.getX());
        assertEquals("Y should be 4", 4, pixel.getY());
        assertEquals("Color should be 'blue'", "blue", pixel.getColor());
    }

    @Test
    public void testToString() {
        Pixel pixel = new Pixel(1, 2, "yellow");
        String expected = "x = 1, y = 2, color = yellow";
        assertEquals("toString should match", expected, pixel.toString());
    }

    @Test
    public void testEquals() {
        Pixel pixel1 = new Pixel(1, 2, "red");
        Pixel pixel2 = new Pixel(1, 2, "red");
        Pixel pixel3 = new Pixel(2, 3, "blue");
        Pixel pixel4 = new Pixel(1, 2, "blue");

        assertTrue("Pixels should be equal", pixel1.equals(pixel2));
        assertFalse("Pixels should not be equal", pixel1.equals(pixel3));
        assertFalse("Pixel should not equal null", pixel1.equals(null));
        assertFalse("Pixel should not equal object of other class", pixel1.equals(new Object()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidColor() {
        Pixel pixel = new Pixel();
        pixel.setColor("green"); // This should throw IllegalArgumentException
    }

    @Test
    public void testHashCode() {
        Pixel pixel1 = new Pixel(1, 2, "red");
        Pixel pixel2 = new Pixel(1, 2, "red");

        // Verify that hash codes are equal for equal objects
        assertEquals(pixel1.hashCode(), pixel2.hashCode());
    }
}
