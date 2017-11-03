import java.util.Random;

/**
 * Class implementing an employee.
 * <p>
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    private String name;
    private String manager;

    public Employee(final String name, final String manager) {
        this.name = name;
        this.manager = manager;
    }

    /*
     * Getter for name
     */
    public String getName(){
        return name;
    }

    /*
     * Setter for name
     */
    public void setName(String name){
        this.name = name;
    }
    
    /*
     * Getter for manager
     */
    public String getManager(){
        return manager;
    }
    
    /*
     * Setter for manager
     */
    public void setManager(String manager){
        this.manager = manager;
    }
}