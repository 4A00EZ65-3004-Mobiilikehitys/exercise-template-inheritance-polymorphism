package exercise;

import static org.junit.Assert.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MyDateTest {

    private MyDate MyDate1;
    private MyDate MyDate2;
    private MyDate MyDate3;

    @Before
    public void setUp() {
        MyDate1 = new MyDate(15, 1, 1990);
        MyDate2 = new MyDate(15, 1, 1990);
        MyDate3 = new MyDate(10, 5, 1985);
    }

    @Test
    public void testGetDay() {
        assertEquals(15, MyDate1.getDay());
    }

    @Test
    public void testSetDayValid() {
        MyDate1.setDay(20);
        assertEquals(20, MyDate1.getDay());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDayInvalid() {
        MyDate1.setDay(32); // Should throw IllegalArgumentException
    }

    @Test
    public void testGetMonth() {
        assertEquals(1, MyDate1.getMonth());
    }

    @Test
    public void testSetMonthValid() {
        MyDate1.setMonth(5);
        assertEquals(5, MyDate1.getMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMonthInvalid() {
        MyDate1.setMonth(13); // Should throw IllegalArgumentException
    }

    @Test
    public void testGetYear() {
        assertEquals(1990, MyDate1.getYear());
    }

    @Test
    public void testSetYearValid() {
        MyDate1.setYear(2000);
        assertEquals(2000, MyDate1.getYear());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetYearInvalid() {
        MyDate1.setYear(1899); // Should throw IllegalArgumentException
    }

    @Test
    public void testMyDateEquality() {
        assertEquals(MyDate1, MyDate2);
    }

    @Test
    public void testMyDateInequality() {
        assertNotEquals(MyDate1, MyDate3);
    }
}
