package LessonsArab.Normal.Stream;

import LessonsArab.Helpers.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMethodsChaining {
    public static void main(String[] args) {

        /*
        Объединение методов цепочки вызовов.
        Intermediate(Lazy) - промежуточные, получают на вход поток и возвращают поток. Можно добавлять через точку и выстраивать цепочку
            .map(), .filter(), sorted(), distinct(), peek(), flatMap(), .min(), .max(), .skip(), .mapToInt()
        Terminal methods(Eager) - конечные, возвращают либо void, либо какое-то значение.
            .reduce(), forEach(), collect(), findFirst()
         */

        int[] intArray = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

        /*
        Сначала в .filter() проверяем на нечетность, т.е. остаток от деления на 2 == 1;      (3, 1, 5, 9, 21, 81, 7)
        Далее для каждого элемента из р-та фильтрации проверяем условие,
            если элемент делится на 3 без остатка, то делим, если нет, то оставляем как есть (1, 1, 5, 3, 7,  27, 7)
        Далее складываем все элементы = 51
        */
        int result = Arrays.stream(intArray).filter(element -> element % 2 == 1)
                .map(element -> {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                }).reduce((accumulator, element) -> accumulator + element).getAsInt();

        System.out.println(result);


        Student Kirill = new Student("Kirill", 'M', 28, 4.23);
        Student Katya = new Student("Katya", 'F', 29, 3.23);
        Student Desdemona = new Student("Desdemona", 'F', 15, 3.23);
        Student Gena = new Student("Gena", 'M', 28, 2.53);
        Student Arina = new Student("Arina", 'F', 22, 4.55);

        List<Student> students = new ArrayList<>(5);
        students.add(Kirill);
        students.add(Katya);
        students.add(Desdemona);
        students.add(Gena);
        students.add(Arina);
        System.out.println(students);

        students.stream().peek(element -> element.setName(element.getName().toUpperCase()))
                .filter(element -> element.getSex() == 'F')
                .sorted(Comparator.comparingInt(Student::getAge))
                .forEach(System.out::println);
    }
}
