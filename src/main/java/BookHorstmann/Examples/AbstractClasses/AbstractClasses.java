package BookHorstmann.Examples.AbstractClasses;

import BookHorstmann.Examples.AbstractClasses.Helpers.Employee;
import BookHorstmann.Examples.AbstractClasses.Helpers.Person;
import BookHorstmann.Examples.AbstractClasses.Helpers.Student;

public class AbstractClasses {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("Harry", 50000.0, 1989, 10, 1);
        people[1] = new Student("Maria", "computer science");

        for(Person person : people) {
            System.out.println(person.getName() + ", " + person.getPersonDescription());
        }
    }
}
