package Lessons.Normal.Collection.Map;

import Helpers.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        /** class LinkedHashMap - наследует/расширяет(extends) HashMap, реализует(implements) Map;
         * В отличие от HashMap, хранит информацию о порядке добавления элементов или порядке их использования
            (каждый элемент содержит ссылки на последующий и предыдущий), из-за этого скорость выполнения методов ниже, чем у HashMap;
         * Важно переопределять метод equals и hashcode для Key, если это самописные объекты;
         * Возможность запоминать последовательность элементов в зависимости от их последнего использования
         */

        LinkedHashMap<Double, Student> doubleStudentLinkedHashMap = new LinkedHashMap<>();

        Student Kirill = new Student("Kirill", 'M', 28, 4.23);
        Student Katya = new Student("Katya", 'F', 29, 3.23);
        Student Desdemona = new Student("Desdemona", 'F', 15, 3.23);
        Student Gena = new Student("Gena", 'M', 28, 2.53);

        doubleStudentLinkedHashMap.put(4.66, Kirill);
        doubleStudentLinkedHashMap.put(2.89, Gena);
        doubleStudentLinkedHashMap.put(4.31, Katya);
        doubleStudentLinkedHashMap.put(3.99, Desdemona);

        System.out.println("\nLinkedHashMap doubleStudentLinkedHashMap порядок добавления сохранился = " + doubleStudentLinkedHashMap);
        System.out.println("_________________________________________________________________________________________");

        LinkedHashMap<Double, Student> doubleStudentLinkedHashMapWithParameters = new LinkedHashMap<>(15, 0.75F, true);
        //Первые два параметра аналогичны HashMap, последний ключ:
        // false - использовать порядок добавления
        // true - использовать порядок взаимодействия с элементами LinkedHashMap. Т.е. тот, с которым взаимодействуем, перемещается в конец.

        Student Kirill2 = new Student("Kirill", 'M', 28, 4.23);
        Student Katya2 = new Student("Katya", 'F', 29, 3.23);
        Student Desdemona2 = new Student("Desdemona", 'F', 15, 3.23);
        Student Gena2 = new Student("Gena", 'M', 28, 2.53);

        doubleStudentLinkedHashMapWithParameters.put(4.66, Kirill2);
        doubleStudentLinkedHashMapWithParameters.put(2.89, Gena2);
        doubleStudentLinkedHashMapWithParameters.put(4.31, Katya2);
        doubleStudentLinkedHashMapWithParameters.put(3.99, Desdemona2);

        System.out.println("Получить значение по ключу 4.66 = " + doubleStudentLinkedHashMapWithParameters.get(4.66));
        System.out.println("Получить значение по ключу 2.89 = " + doubleStudentLinkedHashMapWithParameters.get(2.89));
        System.out.println("\nLinkedHashMap doubleStudentLinkedHashMap порядок использования элементов = " + doubleStudentLinkedHashMapWithParameters);
        System.out.println("_________________________________________________________________________________________");

    }
}

