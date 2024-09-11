package LessonsArab.Normal.Stream;

import LessonsArab.Helpers.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMethod11Collect {
    public static void main(String[] args) {

        /** collect() - терминальный.
         * groupingBy - группировка по
         * partitioningBy - разделение по
         * Все методы stream не меняют массив или коллекцию, на которой они были вызваны.
         */

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
        System.out.println("_________________________________________________________________________________________");

        //groupingBy - группировка по параметру.
        Map<Character, List<Student>> groupingBySex = students.stream()
                .peek(student -> student.setName(student.getName().toUpperCase()))
                .collect(Collectors.groupingBy(Student::getSex));

        System.out.println("groupingBySex: " + groupingBySex);

        for (Map.Entry<Character, List<Student>> entry : groupingBySex.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("_________________________________________________________________________________________");


        Map<Integer, List<Student>> groupingByAge = students.stream()
                .collect(Collectors.groupingBy(Student::getAge));

        System.out.println("groupingByAge: " + groupingByAge);

        for (Map.Entry<Integer, List<Student>> entry : groupingByAge.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("_________________________________________________________________________________________");


        //partitioningBy - разделение по параметру. На вход идет Predicate.
        Map<Boolean, List<Student>> partitioningBySex = students.stream()
                .peek(student -> student.setName(student.getName().toUpperCase()))
                .collect(Collectors.partitioningBy(student -> student.getSex().equals('F')));

        System.out.println("partitioningBySex: " + partitioningBySex);

        for (Map.Entry<Boolean, List<Student>> entry : partitioningBySex.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("_________________________________________________________________________________________");


        Map<Boolean, List<Student>> partitioningByAge = students.stream()
                .collect(Collectors.partitioningBy(student -> student.getAge() > 20));

        System.out.println("partitioningByAge: " + partitioningByAge);

        for (Map.Entry<Boolean, List<Student>> entry : partitioningByAge.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("_________________________________________________________________________________________");
    }
}

