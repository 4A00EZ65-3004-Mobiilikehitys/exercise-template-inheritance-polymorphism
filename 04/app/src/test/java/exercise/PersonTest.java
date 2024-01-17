package exercise;

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.Before;

public class PersonTest {

    private MyDate MyDate1;
    private MyDate MyDate2;
    private MyDate MyDate3;
    private Person person1;
    private Person person2;
    private Employee employee1;

    @Before
    public void setUp() {
        MyDate1 = new MyDate(15, 1, 1990);
        MyDate2 = new MyDate(15, 1, 1990);
        MyDate3 = new MyDate(10, 5, 1985);

        person1 = new Person("John Doe", MyDate1);
        person2 = new Person("John Doe", MyDate2);

        employee1 = new Employee("Alice Smith", MyDate3, 50000.0, MyDate1);
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", person1.getName());
    }

    @Test
    public void testSetNameValid() {
        person1.setName("Jane Smith");
        assertEquals("Jane Smith", person1.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNameInvalid() {
        person1.setName(""); // Should throw IllegalArgumentException
    }

    @Test
    public void testGetBirthday() {
        assertEquals(MyDate1, person1.getBirthday());
    }

    @Test
    public void testSetBirthday() {
        MyDate newMyDate = new MyDate(20, 5, 1995);
        person1.setBirthday(newMyDate);
        assertEquals(newMyDate, person1.getBirthday());
    }

    @Test
    public void testPersonEquality() {
        assertEquals(person1, person2);
    }

    @Test
    public void testPersonInequality() {
        assertNotEquals(person1, employee1);
    }
}
