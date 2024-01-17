package exercise.coordinate;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for Point.
 */
public class PointTest {

    @Test
    public void testDefaultConstructor() {
        Point point = new Point();
        assertEquals("Default X should be 0", 0, point.getX());
        assertEquals("Default Y should be 0", 0, point.getY());
    }

    @Test
    public void testParameterizedConstructor() {
        Point point = new Point(5, 10);
        assertEquals("X should be 5", 5, point.getX());
        assertEquals("Y should be 10", 10, point.getY());
    }

    @Test
    public void testHashCode() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        // Verify that hash codes are equal for equal objects
        assertEquals(point1.hashCode(), point2.hashCode());
    }

    @Test
    public void testSettersAndGetters() {
        Point point = new Point();
        point.setX(3);
        point.setY(4);
        assertEquals("X should be 3", 3, point.getX());
        assertEquals("Y should be 4", 4, point.getY());
    }

    @Test
    public void testToString() {
        Point point = new Point(1, 2);
        String expected = "x = 1, y = 2";
        assertEquals("toString should match", expected, point.toString());
    }

    @Test
    public void testEquals() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        Point point3 = new Point(2, 3);

        assertTrue("Points should be equal", point1.equals(point2));
        assertFalse("Points should not be equal", point1.equals(point3));
        assertFalse("Point should not equal null", point1.equals(null));
        assertFalse("Point should not equal object of other class", point1.equals(new Object()));
    }
}
