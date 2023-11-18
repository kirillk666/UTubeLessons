package LessonsArab.Normal.Stream;

import LessonsArab.Helpers.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods2 {
    public static void main(String[] args) {

        /**
         * stream().filter()
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

        List<Student> studentsFiltered;
        studentsFiltered = students.stream().filter(student -> student.getAge() >= 22 && student.getAverageGrade() > 4.00).collect(Collectors.toList());
        System.out.println(studentsFiltered);

        studentsFiltered.removeAll(students);
        System.out.println(studentsFiltered);

        studentsFiltered.add(Kirill);
        System.out.println(studentsFiltered);
    }
}
