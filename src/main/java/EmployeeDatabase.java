import java.util.ArrayList;
import java.util.List;

/**
 * Implement an EmployeeDatabase class.
 * <p>
 * In this lab we will model some functions of an employee database. We have two classes:
 * EmployeeDatabase and Employee. You only need to finish functions in this class,
 * however you would have to refer to the functions in the other class as well.
 * Also, fix checkstyle errors
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class EmployeeDatabase {

    /**
     * List of employees.
     */
    public List<Employee> employees;

    /**
     * Constructor which initializes the employees list.
     */
    public EmployeeDatabase() {
        employees = new ArrayList<Employee>();
    }

    /**
     * Returns the Manager object for the employee.
     * @param employee
     * @return
     */
    Employee findManager(final Employee employee) {
        Employee manager = null;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName() == employee.getManager()) {
                manager = employees.get(i);
                break;
            }
        }
        return manager;
    }

    /**
     * Count the number of managers above this employee.
     *
     * @param employee name of the employee
     * @return int
     */
    public int countManagersAbove(final Employee employee) {
        /*
         * Implement this function
         */
    }

    /**
     * Count the number of managers above this employee.
     *
     * @param employee name of the employee
     * @return int
     */
    public int countEmployeesUnder(final Employee employee) {
        /*
         * Implement this function
         */
    }


    /**
     * Main method for testing. Do not modify
     *
     * @param unused unused input arguments
     */
    @SuppressWarnings("checkstyle:magicnumber")
    public static void main(final String[] unused) {

        EmployeeDatabase database = new EmployeeDatabase();

        Employee betty = new Employee("Betty", "Sam");
        database.employees.add(betty);
        Employee bob = new Employee("Bob", "Sally");
        database.employees.add(bob);
        Employee dilbert = new Employee("Dilbert", "Nathan");
        database.employees.add(dilbert);
        Employee joseph = new Employee("Joseph", "Sally");
        database.employees.add(joseph);
        Employee nathan = new Employee("Nathan", "Veronica");
        database.employees.add(nathan);
        Employee sally = new Employee("Sally", "Veronica");
        database.employees.add(sally);
        Employee sam = new Employee("Sam", "Joseph");
        database.employees.add(sam);
        Employee susan = new Employee("Susan", "Bob");
        database.employees.add(susan);
        Employee veronica = new Employee("Veronica", "");
        database.employees.add(veronica);

        System.out.println("Welcome to the employee database\n\n");

        // Count employees under
        int answer = database.countEmployeesUnder(sally);
        System.out.println("Sally has " + Integer.toString(answer) + " employees under her.\n");

        answer = database.countEmployeesUnder(nathan);
        System.out.println("Nathan has " + Integer.toString(answer) + " employees under him.\n");

        answer = database.countEmployeesUnder(betty);
        System.out.println("Betty has " + Integer.toString(answer) + " employees under her.\n");

        answer = database.countEmployeesUnder(veronica);
        System.out.println("Veronica has " + Integer.toString(answer) + " employees under her.\n");

        // Count managers above
        answer = database.countManagersAbove(sally);
        System.out.println("Sally has " + Integer.toString(answer) + " managers above her.\n");

        answer = database.countManagersAbove(veronica);
        System.out.println("Veronica has " + Integer.toString(answer) + " managers above her.\n");

        answer = database.countManagersAbove(bob);
        System.out.println("Bob has " + Integer.toString(answer) + " managers above him.\n");

        answer = database.countManagersAbove(betty);
        System.out.println("Betty has " + Integer.toString(answer) + " managers above her.\n");
    }
}
