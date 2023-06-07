package Lessons.Normal.Collection.Map;

import Helpers.Student;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        /** class TreeMap
         * В TreeMap, как и в HashMap элементами являются пары Key/Value;
         * Элементы хранятся в отсортированном виде в порядке возрастания Key;
         * Key должны быть уникальны, как и в TreeMap;
         * !!! Для TreeMap не нужно переопределять методы equals и hashCode, т.к. все сравнения идут основываясь на метод
            compareTo для Key, но все равно рекомендуется переопределять;
         * В основе TreeMap лежит Red Black Tree - один из видов самобалансирующихся (перестраивается по мере добавления элементов) двоичных
            (у каждого элемента по 2 потомка, левый меньше, чем вершина, правый - больше) деревьев поиска;
         * Скорость O(logn)
         * HashMap - not synchronised, ее не нужно использовать в многопоточном программировании
         */

        TreeMap<Double, Student> doubleStudentTreeMap = new TreeMap<>();
        Student Kirill = new Student("Kirill", 'M', 28);
        Student Katya = new Student("Katya", 'F', 29);
        Student Desdemona = new Student("Desdemona", 'F', 15);
        Student Kitty = new Student("Kitty", 'F', 25);
        Student Oksana = new Student("Oksana", 'F', 29);
        Student Gena = new Student("Gena", 'M', 28);
        Student Ragnar = new Student("Ragnar", 'M', 25);

        doubleStudentTreeMap.put(4.83, Kirill);
        doubleStudentTreeMap.put(3.23, Katya);
        doubleStudentTreeMap.put(3.22, Desdemona);
        doubleStudentTreeMap.put(4.33, Kitty);
        doubleStudentTreeMap.put(4.55, Oksana);
        doubleStudentTreeMap.put(2.53, Gena);
        doubleStudentTreeMap.put(4.53, Ragnar);

        System.out.println("\ndoubleStudentTreeMap = " + doubleStudentTreeMap);
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Элемент с Key 4.83 = " + doubleStudentTreeMap.get(4.83));
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Элемент с Key 2.53 удален = " + doubleStudentTreeMap.remove(2.53));
        System.out.println(doubleStudentTreeMap);
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Элементы отсортированы в обратном порядке по Key = " + doubleStudentTreeMap.descendingMap());
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Вывод элементов с Key от 4.5 = " + doubleStudentTreeMap.tailMap(4.5));
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Вывод элементов с Key до 4.5 = " + doubleStudentTreeMap.headMap(4.5));
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Вывод последнего элемента, т.е. с самым большим значением Key = " + doubleStudentTreeMap.lastEntry());
        System.out.println("_________________________________________________________________________________________");

        System.out.println("Вывод первого элемента, т.е. с самым маленьким значением Key = " + doubleStudentTreeMap.firstEntry());
        System.out.println("_________________________________________________________________________________________");

        TreeMap<Student, Double> studentDoubleTreeMap = new TreeMap<>();
        Student Kirill2 = new Student("Kirill", 'M', 28);
        Student Katya2 = new Student("Katya", 'F', 29);
        Student Desdemona2 = new Student("Desdemona", 'F', 15);
        Student Kitty2 = new Student("Kitty", 'F', 25);
        Student Oksana2 = new Student("Oksana", 'F', 29);
        Student Gena2 = new Student("Gena", 'M', 28);
        Student Ragnar2 = new Student("Ragnar", 'M', 25);

        studentDoubleTreeMap.put(Kirill2, 4.83);
        studentDoubleTreeMap.put(Katya2, 3.23);
        studentDoubleTreeMap.put(Desdemona2, 3.22);
        studentDoubleTreeMap.put(Kitty2, 4.33);
        studentDoubleTreeMap.put(Oksana2, 4.55);
        studentDoubleTreeMap.put(Gena2, 2.53);
        studentDoubleTreeMap.put(Ragnar2, 4.53);

        System.out.println("\n\nstudentDoubleTreeMap" + studentDoubleTreeMap);
        System.out.println("_________________________________________________________________________________________");
    }
}
