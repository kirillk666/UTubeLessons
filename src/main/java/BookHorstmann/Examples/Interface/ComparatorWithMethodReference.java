package BookHorstmann.Examples.Interface;

import BookHorstmann.Examples.AbstractClasses.Helpers.Employee;
import BookHorstmann.Examples.AbstractClasses.Helpers.Person;
import BookHorstmann.Examples.AbstractClasses.Helpers.Student;

import java.util.Arrays;
import java.util.Comparator;

//6.2.8 page 311
public class ComparatorWithMethodReference {
    public static void main(String[] args) {
        Person[] people = new Person[6];
        people[0] = new Employee("Harry", "Swanson", 63000.0, 1989, 10, 1);
        people[1] = new Employee("Harry", "Potter", 51000.0, 1989, 10, 1);
        people[2] = new Student("Ivan", "Grozny", "computer science");
        people[3] = new Student("Maria", "Ellington", "computer science");
        people[4] = new Employee("Olga", "Timofeeva", 54000.0, 1989, 10, 1);
        people[5] = new Student("Stepan", "Razin", "computer science");

        System.out.println(Arrays.toString(people) + "\n");

        /* Статический метод comparing() интерфейса Comparator принимает на вход функцию извлечения ключей, приводящую
        обобщенный тип Т к сравниваемому виду, например, String. */
        Arrays.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sort by name: " + Arrays.toString(people) + "\n");

        //В обратном порядке (развернуть)
        Arrays.sort(people, Comparator.comparing(Person::getName).reversed());
        System.out.println("Sort by name, then reverse: " + Arrays.toString(people) + "\n");

        Arrays.sort(people, Comparator.comparing(Person::getName).thenComparing(Person::getSurname));
        System.out.println("Sort by name, then surname: " + Arrays.toString(people) + "\n");

        /* Можно указать компаратор для сравнения по ключам, извлекаемым методами comparing() и thenComparing().
        Например, можно указать, чтобы люди сортировались по длине их имен. */
        Arrays.sort(people, Comparator.comparing(Person::getName, (s, t) -> Integer.compare(s.length(), t.length())));
        //Или варианты без упаковки
        Arrays.sort(people, Comparator.comparingInt(p -> p.getName().length()));
        System.out.println("Sort by name length: " + Arrays.toString(people) + "\n");
    }
}
