package LessonsArab.Normal.Stream;

import LessonsArab.Helpers.Student;

import java.util.ArrayList;
import java.util.List;

public class StreamMethod2Peek {
    public static void main(String[] args) {

        /** peek() - как forEach, только возвращает поток, т.е. промежуточный.
         * Цель: Выполняет побочные действия с элементами потока, не изменяя их. Важно: изменение поля объекта не является изменением самого объекта.
         * Функция: Принимает функцию, которая выполняет какое-либо действие с каждым элементом потока, но не преобразует его.
         * Тип результата: Возвращает тот же поток, не изменяя элементы.
         * Применение: Используется для выполнения побочных эффектов, таких как логирование или отладка, без изменения самих данных.
         * Все методы stream не меняют массив или коллекцию, на которой они были вызваны.
         */
        List<String> strings = new ArrayList<>();
        strings.add("Aina");
        strings.add("Jenna");
        strings.add("Jenifer");
        strings.add("Jenifer");

        long uniqueCount = strings.stream().distinct().peek(System.out::println).count();
        System.out.println(uniqueCount);
        System.out.println("_________________________________________________________________________________________");

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

        students.stream().peek(student -> student.setAge(student.getAge() + 10))
                .forEach(System.out::println);
    }
}
