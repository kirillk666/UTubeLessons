package BookHorstmann.Examples.Inheritance;

import BookHorstmann.Examples.Inheritance.Helpers.Employee;
import BookHorstmann.Examples.Inheritance.Helpers.Manager;

public class Inheritance {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl", 80000.0, 1987, 12,15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry", 50000.0, 1989, 10, 1);
        staff[2] = new Employee("Tommy", 40000.0, 1990, 3, 12);

        for(Employee employee : staff) {
            System.out.println("Name=" + employee.getName()
                    + ", salary=" + employee.getSalary()
                    + ", hire date=" + employee.getHireDay());
        }
    }
}
