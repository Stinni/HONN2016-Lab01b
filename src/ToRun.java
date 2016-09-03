/**
 * Klasinn ToRun (ToRun.java)
 * Prófar Employee og Manager klasana
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 02.09.16
 */

public class ToRun extends Object
{
    public static void main(String[] args)
    {
        // Liður 3
        /*
        Employee e0 = new Employee("Dilbert");
        Employee e1 = new Manager("Pointy Haired", "Boss");
        System.out.println("e0: " + e0);
        System.out.println("e1: " + e1);
        */

        // Liður 5
        /*
        Employee e0 = new Employee("Dilbert");
        Employee e1 = new Manager("Pointy Haired", "Boss");
        Employee elist[] = new Employee[2];
        elist[0] = e0;
        elist[1] = e1;
        for (int i = 0; i < elist.length; i++) {
            System.out.println(i + ":" + elist[i]);
        }
        */

        // Liður 7
        Employee e0 = new Employee("Dilbert");
        Employee e1 = new Manager("Pointy Haired", "Boss");
        Employee elist[] = new Employee[2];
        elist[0] = e0;
        elist[1] = e1;
        for (int i = 0; i < 2; i++)
        {
            System.out.println(elist[i].getName());
            if (elist[i] instanceof Manager)
            {
                Manager m = (Manager) elist[i];
                System.out.println("\t" + m.getTitle());
            }
        }
    }
}
