/**
 * Implement an EmployeeDatabase class.
 * <p>
 * In this lab we will model some functions of an employee database. We have two classes: EmployeeDatabase and Employee. You only need to finish
 * functions in this class, however you would have to refer to the functions in the other class as well. Also, fix checkstyle errors
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class EmployeeDatabase {

    public List<Employee> employees;

    /**
     * Count the number of managers above this employee
     * 
     * @param employeeName name of the employee
     * @return int
     */

    public int countManagersAbove(final String employeeName) {
        /*
         * Implement this function
         */
    }

    /**
     * Count the number of managers above this employee.
     *
     * @param employeeName name of the employee
     * @return int
     */

    public int countEmployeesUnder(final String employeeName) {
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

        employees = new ArrayList<Employee>();
        employees.add(new Employee("Betty", "Sam"));
        employees.add(new Employee("Bob", "Sally"));
        employees.add(new Employee("Dilbert", "Nathan"));
        employees.add(new Employee("Joseph", "Sally"));
        employees.add(new Employee("Nathan", "Veronica"));
        employees.add(new Employee("Sally", "Veronica"));
        employees.add(new Employee("Sam", "Joseph"));
        employees.add(new Employee("Susan", "Bob"));
        employees.add(new Employee("Veronica", ""));

        System.out.println("Welcome to the employee database\n\n");

        // Count employees under
        int answer = countEmployeesUnder("Sally");
        System.out.println("Sally has " + Integer.toString(answer) + " employees under her.\n");

        answer = countEmployeesUnder("Nathan");
        System.out.println("Nathan has " + Integer.toString(answer) + " employees under him.\n");

        answer = countEmployeesUnder("Betty");
        System.out.println("Betty has " + Integer.toString(answer) + " employees under her.\n");

        answer = countEmployeesUnder("Veronica");
        System.out.println("Veronica has " + Integer.toString(answer) + " employees under her.\n");

        // Count managers above
        answer = countManagersAbove("Sally");
        System.out.println("Sally has " + Integer.toString(answer) + " managers above her.\n");

        answer = countManagersAbove("Veronica");
        System.out.println("Veronica has " + Integer.toString(answer) + " managers above her.\n");

        answer = countManagersAbove("Bob");
        System.out.println("Bob has " + Integer.toString(answer) + " managers above him.\n");

        answer = countManagersAbove("Betty");
        System.out.println("Betty has " + Integer.toString(answer) + " managers above her.\n");
    }
}
