package LessonsUtube.Normal.Stream;

import LessonsUtube.Helpers.Student;

import java.util.ArrayList;
import java.util.List;

public class StreamMethod15MapToInt {
    public static void main(String[] args) {

        /**
         * .mapToInt() - возвращает int stream. Есть и другие типа mapToDouble, mapToLong.
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


        List<Integer> ages = students.stream()
                .mapToInt(Student::getAge)
                .boxed() //Без этого метода не получится int stream запихать в list. Конвертирует int в Integer
                .toList();
        System.out.println(ages);
        System.out.println("_________________________________________________________________________________________");

        //Дочерние методы - терминальные.

        int sum = students.stream()
                .mapToInt(Student::getAge)
                .sum();
        System.out.println("Sum age: " + sum);
        System.out.println("_________________________________________________________________________________________");

        double average = students.stream()
                .mapToInt(Student::getAge)
                .average()
                .getAsDouble();
        System.out.println("Average age: " + average);
        System.out.println("_________________________________________________________________________________________");

        int min = students.stream()
                .mapToInt(Student::getAge)
                .min().getAsInt();
        System.out.println("Min age: " + min);
        System.out.println("_________________________________________________________________________________________");

        int max = students.stream()
                .mapToInt(Student::getAge)
                .max().getAsInt();
        System.out.println("Max age: " + max);
        System.out.println("_________________________________________________________________________________________");
    }
}