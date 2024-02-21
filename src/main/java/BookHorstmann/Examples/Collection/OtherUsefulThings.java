package BookHorstmann.Examples.Collection;

import BookHorstmann.Examples.Object.Equals.Helpers.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OtherUsefulThings {
    public static void main(String[] args) {
        //unmodified
        List<String> strings = List.of("one", "two", "three");
//        strings.add("four"); => java.lang.UnsupportedOperationException
        System.out.println(strings);

        //modified
        List<String> stringsModified = new ArrayList<>(List.of("one", "two", "three"));
        stringsModified.add("four");
        System.out.println(stringsModified + "\n");

        //unmodified + nCopies
        List<String> stringCopies = Collections.nCopies(5, "some string");
//        stringCopies.add("another string"); => java.lang.UnsupportedOperationException
        System.out.println(stringCopies);

        //modified + nCopies
        List<String> stringCopiesModified = new ArrayList<>(Collections.nCopies(5, "some string"));
        stringCopiesModified.add("another string");
        System.out.println(stringCopiesModified + "\n");

        //sort
        Employee alice1 = new Employee("Alice Adams", 12000, 1987, 12, 15);
        Employee katya = new Employee("Kate Adams", 63000, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandon", 50000, 1989, 10, 1);
        List<Employee> employees = new ArrayList<>(List.of(bob, alice1, katya));

        Collections.sort(employees);
        System.out.println("employees: " + employees);

        employees.sort(Comparator.reverseOrder());
        System.out.println("employees reverse order: " + employees);

        Collections.shuffle(employees);
        System.out.println("employees shuffled: " + employees);

        employees.sort(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("employees sorted: " + employees);

        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println("employees sorted reverse order: " + employees);
    }
}
