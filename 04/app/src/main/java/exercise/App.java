package exercise;

/**
 * Exercise 04.
 */
public final class App {
    private static final int BIRTHDAY_DAY = 15;
    private static final int BIRTHDAY_MONTH = 1;
    private static final int BIRTHDAY_YEAR = 1990;
    private static final int START_DAY_DAY = 10;
    private static final int START_DAY_MONTH = 5;
    private static final int START_DAY_YEAR = 1985;
    private static final String PERSON_NAME = "John Doe";
    private static final String EMPLOYEE_NAME = "Alice Smith";
    private static final double EMPLOYEE_WAGE = 50000.0;

    private App() {
        // Utility class, no instantiation required
    }

    /**
     * The main method that serves as the entry point for the application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(final String[] args) {
        MyDate date1 = new MyDate(BIRTHDAY_DAY, BIRTHDAY_MONTH,
                BIRTHDAY_YEAR);
        MyDate date2 = new MyDate(START_DAY_DAY, START_DAY_MONTH,
                START_DAY_YEAR);

        Person person1 = new Person(PERSON_NAME, date1);
        Employee employee1 = new Employee(EMPLOYEE_NAME, date2, EMPLOYEE_WAGE,
                                            date1);

        System.out.println(person1.toString());
        System.out.println(employee1.toString());
    }
}
