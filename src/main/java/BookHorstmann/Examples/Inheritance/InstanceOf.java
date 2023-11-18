package BookHorstmann.Examples.Inheritance;

import BookHorstmann.Examples.Inheritance.Helpers.Employee;
import BookHorstmann.Examples.Inheritance.Helpers.Manager;

public class InstanceOf {
    public static void main(String[] args) {
        double x = 3.505;
        int nx = (int) x;
        System.out.println(nx);

        Manager boss = new Manager("Test", 88888, 1999, 10, 10);
        System.out.println(boss);

        Employee employee = (Manager) boss;
        System.out.println(employee);
    }
}
