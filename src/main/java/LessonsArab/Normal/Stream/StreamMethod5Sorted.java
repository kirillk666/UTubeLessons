package LessonsArab.Normal.Stream;

import LessonsArab.Helpers.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod5Sorted {
    public static void main(String[] args) {

        /**
         * stream().sorted() - нужен для сортировки.
         * Все методы stream не меняют массив или коллекцию, на которой они были вызваны.
         */

        int[] intArray = {1, 4, 5, 6, 7, 333, 64, 15, 723, 67};
        intArray = Arrays.stream(intArray).sorted().toArray();
        System.out.println(Arrays.toString(intArray));

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

        //Для объектов используется компаратор
        students = students.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted by comparator in class: + " + students);

        //Либо можно прописать сортировку в лямбде
        students = students.stream().sorted((x, y) -> x.getAge().compareTo(y.getAge())).collect(Collectors.toList());
        System.out.println("Sorted by comparator in lambda: + " + students);
    }
}
