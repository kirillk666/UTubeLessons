package BookHorstmann.Examples.Object.Equals;

import BookHorstmann.Examples.Object.Equals.Helpers.Employee;
import BookHorstmann.Examples.Object.Equals.Helpers.Manager;

//5.2.2 page 227
public class Equals {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandon", 50000, 1989, 10, 1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3) + "\n");

        System.out.println("alice1.equals(alice2): " + (alice1.equals(alice2)));
        System.out.println("alice1.equals(alice3): " + (alice1.equals(alice3)) + "\n");

        System.out.println("alice1.hashCode: " + alice1.hashCode());
        System.out.println("alice2.hashCode: " + alice1.hashCode());
        System.out.println("alice3.hashCode: " + alice1.hashCode() + "\n");

        System.out.println("alice1.equals(bob): " + (alice1.equals(bob)) + "\n");

        System.out.println("bob.toString(): " + bob + "\n");

        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        System.out.println("boss.toString(): " + boss + "\n");

        System.out.println("carl.equals(boss): " + carl.equals(boss) + "\n");

        System.out.println("carl.hashCode: " + carl.hashCode() + "\n");
        System.out.println("boss.hashCode: " + boss.hashCode() + "\n");
    }
}
