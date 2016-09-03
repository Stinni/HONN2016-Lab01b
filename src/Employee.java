/**
 * Klasinn Employee (Employee.java)
 * geymir upplýsingar um starfsmann
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 02.09.16
 */

public class Employee
{
    private String name;

    public Employee()
    {
    }

    public Employee(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "Employee: " + getName();
    }
}
