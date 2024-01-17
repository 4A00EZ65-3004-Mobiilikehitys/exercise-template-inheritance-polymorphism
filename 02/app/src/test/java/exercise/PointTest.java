package exercise.coordinate;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for Point.
 */
public class PointTest {

    @Test
    public void testDefaultConstructor() {
        Point point = new Point();
        assertEquals("Default X coordinate should be 0", 0, point.getX());
        assertEquals("Default Y coordinate should be 0", 0, point.getY());
    }

    @Test
    public void testParameterizedConstructor() {
        Point point = new Point(10, 20);
        assertEquals("X coordinate should be 10", 10, point.getX());
        assertEquals("Y coordinate should be 20", 20, point.getY());
    }

    @Test
    public void testSettersAndGetters() {
        Point point = new Point();
        point.setX(30);
        point.setY(40);

        assertEquals("X coordinate should be 30", 30, point.getX());
        assertEquals("Y coordinate should be 40", 40, point.getY());
    }

    @Test
    public void testToString() {
        Point point = new Point(5, 10);
        String expected = "x = 5, y = 10";
        assertEquals("toString should return correct representation",
                     expected, point.toString());
    }

}
