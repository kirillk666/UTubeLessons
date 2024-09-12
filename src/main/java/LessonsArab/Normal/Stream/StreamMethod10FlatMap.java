package LessonsArab.Normal.Stream;

import LessonsArab.Helpers.Faculty;
import LessonsArab.Helpers.Student;

import java.util.ArrayList;
import java.util.List;

public class StreamMethod10FlatMap {
    public static void main(String[] args) {

        /** flatMap() - используется, когда нужно поработать не с элементами коллекции, а с элементами элементов коллекции.
         т.е. с коллекцией внутри коллекции.
         * Промежуточный метод.
         * Все методы stream не меняют массив или коллекцию, на которой они были вызваны.
         */

        Student Kirill = new Student("Kirill", 'M', 28, 4.23);
        Student Katya = new Student("Katya", 'F', 29, 3.23);
        Student Desdemona = new Student("Desdemona", 'F', 15, 3.23);
        Student Gena = new Student("Gena", 'M', 28, 2.53);
        Student Arina = new Student("Arina", 'F', 22, 4.55);

        Faculty economics = new Faculty("Economics");
        Faculty math = new Faculty("Applied Mathematics");

        math.addStudentsToFaculty(Kirill, Katya, Arina);
        economics.addStudentsToFaculty(Desdemona, Gena);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(math);
        facultyList.add(economics);

        //Тут получаем стрим всех студентов с разных коллекций (факультетов) внутри коллекции коллекций (списка факультетов)
        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(student -> System.out.println(student.getName()));
    }
}
