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

    Employee findManager(Employee employee){
        Employee manager;
        for(int i=0;i<employees.size();i++){
            if (employees[i].getName() == employee.getManager()){
                manager = employees[i];
                break;
            }
        }
        return manager;
    }

    /**
     * Count the number of managers above this employee
     * 
     * @param employeeName name of the employee
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
     * @param employeeName name of the employee
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

        employees = new ArrayList<Employee>();
        Employee betty = new Employee("Betty", "Sam");
        employees.add(betty);
        Employee bob = new Employee("Bob", "Sally");
        employees.add(bob);
        Employee dilbert = new Employee("Dilbert", "Nathan");
        employees.add(dilbert);
        Employee joseph = new Employee("Joseph", "Sally");
        employees.add(joseph);
        Employee nathan = new Employee("Nathan", "Veronica");
        employees.add(nathan);
        Employee sally = new Employee("Sally", "Veronica");
        employees.add(sally);
        Employee sam = new Employee("Sam", "Joseph");
        employees.add(sam);
        Employee susan = new Employee("Susan", "Bob");
        employees.add(susan);
        Employee veronica = new Employee("Veronica", "");
        employees.add(veronica);

        System.out.println("Welcome to the employee database\n\n");

        // Count employees under
        int answer = countEmployeesUnder(sally);
        System.out.println("Sally has " + Integer.toString(answer) + " employees under her.\n");

        answer = countEmployeesUnder(nathan);
        System.out.println("Nathan has " + Integer.toString(answer) + " employees under him.\n");

        answer = countEmployeesUnder(betty);
        System.out.println("Betty has " + Integer.toString(answer) + " employees under her.\n");

        answer = countEmployeesUnder(veronica);
        System.out.println("Veronica has " + Integer.toString(answer) + " employees under her.\n");

        // Count managers above
        answer = countManagersAbove(sally);
        System.out.println("Sally has " + Integer.toString(answer) + " managers above her.\n");

        answer = countManagersAbove(veronica);
        System.out.println("Veronica has " + Integer.toString(answer) + " managers above her.\n");

        answer = countManagersAbove(bob);
        System.out.println("Bob has " + Integer.toString(answer) + " managers above him.\n");

        answer = countManagersAbove(betty);
        System.out.println("Betty has " + Integer.toString(answer) + " managers above her.\n");
    }
}
