/**
 * Klasinn Manager (Manager.java)
 * geymir upplýsingar um yfirmann - erfir klasann Employee
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 02.09.16
 */

public class Manager extends Employee
{
    private String title;

    public Manager(String name, String title)
    {
        super(name);
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public String toString()
    {
        return "Manager: " + getName() + ", " + getTitle();
    }
}
