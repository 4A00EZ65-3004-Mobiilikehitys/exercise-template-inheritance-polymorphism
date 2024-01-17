package exercise;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

    private MyDate myDate1;
    private MyDate myDate2;
    private MyDate myDate3;
    private Employee employee1;
    private Employee employee2;
    private Employee employee3;

    @Before
    public void setUp() {
        myDate1 = new MyDate(15, 1, 1990);
        myDate2 = new MyDate(15, 1, 1990);
        myDate3 = new MyDate(10, 5, 1985);

        employee1 = new Employee("Alice Smith", myDate3, 50000.0, myDate1);
        employee2 = new Employee("Alice Smith", myDate3, 50000.0, myDate1);
        employee3 = new Employee("Bob Johnson", myDate3, 60000.0, myDate1);
    }

    @Test
    public void testEquals() {
        // Test equality of two identical employees
        assertTrue(employee1.equals(employee2));

        // Test inequality of two different employees
        assertFalse(employee1.equals(employee3));
    }

    @Test
    public void testHashCode() {
        // Test that equal employees have the same hash code
        assertEquals(employee1.hashCode(), employee2.hashCode());

        // Test that different employees have different hash codes
        assertNotEquals(employee1.hashCode(), employee3.hashCode());
    }

    @Test
    public void testGetWage() {
        assertEquals(50000.0, employee1.getWage(), 0.01);
    }

    @Test
    public void testSetWageValid() {
        employee1.setWage(55000.0);
        assertEquals(55000.0, employee1.getWage(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWageInvalid() {
        employee1.setWage(-1000.0); // Should throw IllegalArgumentException
    }

    @Test
    public void testGetStartDay() {
        assertEquals(myDate1, employee1.getStartDay()); // Use lowercase variable name
    }

    @Test
    public void testSetStartDay() {
        MyDate newMyDate = new MyDate(20, 5, 2000);
        employee1.setStartDay(newMyDate);
        assertEquals(newMyDate, employee1.getStartDay());
    }

    @Test
    public void testEmployeeToString() {
        assertEquals("Name: Alice Smith, Birthday: 10/05/1985, Wage: 50000.0, Start Day: 15/01/1990", employee1.toString());
    }
}
