package LessonsArab.Normal.Stream;

import LessonsArab.Helpers.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethods3 {
    public static void main(String[] args) {

        /** stream().forEach()
         * Ничего не возвращает, поэтому нельзя результат просто так положить в какую-то коллекцию
         */

        int[] array = {3, 5, 6, 7, 9};
        Arrays.stream(array).forEach(element -> {
            element *= 2;
            System.out.println(element);});
        System.out.println("_________________________________________________________________________________________");

        Arrays.stream(array).forEach(element -> System.out.println(element));
        System.out.println("_________________________________________________________________________________________");

        /**
         * method reference
         */
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("_________________________________________________________________________________________");

        //Каждый элемент потока поместить в метод myMethod в кач-ве параметра в класс MethodReference
        Arrays.stream(array).forEach(MethodReference::myMethod);
        System.out.println("_________________________________________________________________________________________");
        //Заменяет запись вида:
        Arrays.stream(array).forEach(value -> MethodReference.myMethod(value));
        System.out.println("_________________________________________________________________________________________");

        //Еще пример стрима. Поскольку тут не создаем объект, который наследует интерфейс List, то данные кладем в unmodifiableList (см. StreamMethods4.java)
        Student Kirill = new Student("Kirill", 'M', 28, 4.23);
        Student Katya = new Student("Katya", 'F', 29, 3.23);
        Student Desdemona = new Student("Desdemona", 'F', 15, 3.23);
        Student Gena = new Student("Gena", 'M', 28, 2.53);
        Student Arina = new Student("Arina", 'F', 22, 4.55);

        Stream<Student> studentStream = Stream.of(Kirill, Katya, Desdemona, Gena, Arina);
        List<Student> studentList = studentStream.filter(student -> student.getSex().equals('F')).toList();
        System.out.println(studentList);
        System.out.println("_________________________________________________________________________________________");

        //Либо сразу
        List<Student> studentList2 = Stream.of(Kirill, Katya, Desdemona, Gena, Arina).filter(student -> student.getSex().equals('F')).toList();
        System.out.println(studentList2);
        System.out.println("_________________________________________________________________________________________");
    }
}

class MethodReference {
    public static void myMethod(int a) {
        a += 5;
        System.out.println("Element = " + a);
    }
}
