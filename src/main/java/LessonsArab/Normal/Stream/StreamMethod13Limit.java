package LessonsArab.Normal.Stream;

import LessonsArab.Helpers.Student;

import java.util.ArrayList;

public class StreamMethod13Limit {
    public static void main(String[] args) {

        /**
         * .limit() - ограничивает кол-во элементов в стриме.
         * Промежуточный.
         * Все методы stream не меняют массив или коллекцию, на которой они были вызваны.
         */

        Student Kirill = new Student("Kirill", 'M', 28, 4.23);
        Student Katya = new Student("Katya", 'F', 29, 3.23);
        Student Desdemona = new Student("Desdemona", 'F', 15, 3.23);
        Student Gena = new Student("Gena", 'M', 28, 2.53);
        Student Arina = new Student("Arina", 'F', 22, 4.55);

        ArrayList<Student> students = new ArrayList<>(5);
        students.add(Kirill);
        students.add(Katya);
        students.add(Desdemona);
        students.add(Gena);
        students.add(Arina);
        System.out.println(students);
        System.out.println("_________________________________________________________________________________________");


        students.stream().filter(student -> student.getSex().equals('F'))
                .forEach(System.out::println);
        System.out.println("_________________________________________________________________________________________");


        students.stream().filter(student -> student.getSex().equals('F'))
                .limit(1)
                .forEach(System.out::println);
    }
}