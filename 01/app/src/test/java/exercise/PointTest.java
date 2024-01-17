package exercise.coordinate;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for Point.
 */
public class PointTest {

    @Test
    public void testSettersAndGetters() {
        Point point = new Point();
        point.setX(10);
        point.setY(20);

        assertEquals("X coordinate should be 10", 10, point.getX());
        assertEquals("Y coordinate should be 20", 20, point.getY());
    }

    @Test
    public void testToString() {
        Point point = new Point();
        point.setX(5);
        point.setY(10);

        String expected = "x = 5, y = 10";
        assertEquals("toString should return correct representation",
                     expected, point.toString());
    }
}
