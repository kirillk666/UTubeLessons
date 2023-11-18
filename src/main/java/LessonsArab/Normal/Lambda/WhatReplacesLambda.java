package LessonsArab.Normal.Lambda;

import LessonsArab.Helpers.Student;
import LessonsArab.Helpers.StudentChecks;
import LessonsArab.Helpers.StudentHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class WhatReplacesLambda {
    public static void main(String[] args) {

        /** Lambda expressions
         * Позволяет использовать функциональное программирование, в то время как java - ООП.
         * Позволяет использовать метод в кач-ве параметра.
         * Можно использовать только с функциональным интерфейсом, т.е. который содержит только 1 абстрактный метод.
         * В лямбде -> разделяет параметры метода и тело метода, которое было бы у метода соответствующего класса,
         имплементировавшего функциональный интерфейс.
         * Если в абстрактном методе более одного параметра, то их нужно всегда брать в скобки
         * Лямбду можно присвоить в переменную.
         * Про видимость переменных внутри и вне лямбды см. в AnotherLambdaExample.java
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
        //1
        System.out.println("Можно выборки студентов реализовать в отдельном классе отдельными методами:");
        StudentHelper.printStudentOverGrade(students, 4.00);
        System.out.println("_________________________________________________________________________________________");
        StudentHelper.printStudentUnderAge(students, 25);
        System.out.println("_________________________________________________________________________________________");
        StudentHelper.printStudentMixedCondition(students, 25, 4.00, 'F');
        System.out.println("_________________________________________________________________________________________");

        //2
        System.out.println("Можно выборки студентов реализовать с помощью вспомогательных классов, которые будут " +
                "имплементировать boolean interface, делая override метода check:");
        //Плохая реализация, т.к. в классах CheckStudentsUnderAge и CheckStudentsOverGrade хардкод условий выборки.
        //Плодим кучу классов, которые будут имплементировать interface StudentChecks
        StudentHelper.checkStudents(students, new StudentHelper.CheckStudentsUnderAge());
        System.out.println("_________________________________________________________________________________________");
        StudentHelper.checkStudents(students, new StudentHelper.CheckStudentsOverGrade());
        System.out.println("_________________________________________________________________________________________");

        //3
        System.out.println("Можно выборки студентов реализовать с помощью анонимных классов (anonymous classes), которые будут " +
                "имплементировать boolean interface, делая override метода check:");
        //Данный способ без хардкода условий выборки и создания лишний классов, которые будут имплементировать interface.
        //Дает гибкость, делая разовый override метода check для interface StudentChecks
        //noinspection Convert2Lambda
        StudentHelper.checkStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student student) {
                return student.getAge() < 25;
            }
        });
        System.out.println("_________________________________________________________________________________________");

        //4
        System.out.println("Lambda expression полный вариант написания: ");
        //На вход метода checkStudents(ArrayList<Student> students, StudentChecks checks) java ожидает
        //коллекцию студентов первым аргументом, а вторым - объект, который имплементирует интерфейс StudentChecks.
        //Поскольку интерфейс имеет только 1 абстрактный метод check (является функциональным интерфейсом),
        //можно использовать лямбда выражения.
        //Этот метод получает на вход объект класса student и проверяет соответствие boolean условию.
        //Таким образом в метод мы передаем коллекцию студентов первым аргументом, а вторым передаем входные
        //аргументы для метода check интерфейса StudentChecks (т.е. student), далее ставим -> {и переопределяем метод check как нам надо}
        StudentHelper.checkStudents(students, (Student student) -> {
            return student.getAge() < 25;
        });
        System.out.println("_________________________________________________________________________________________");

        //5
        System.out.println("Lambda expression короткий вариант написания: ");
        StudentHelper.checkStudents(students, student -> student.getAge() < 25);
        System.out.println("_________________________________________________________________________________________");
        StudentHelper.checkStudents(students, student -> student.getAverageGrade() > 4.00);
        System.out.println("_________________________________________________________________________________________");
        StudentHelper.checkStudents(students, student -> student.getAverageGrade() >= 4.00 && student.getAge() < 25 && student.getSex() == 'F');

        /**
         *  Если в теле метода нужно написать более одного statement, то используется только длинная форма записи
         */

        System.out.println("_________________________________________________________________________________________");
        StudentHelper.checkStudents(students, student -> {
            System.out.println("More than 1 statement");
            return student.getAverageGrade() > 4;
        });
        System.out.println("_________________________________________________________________________________________");


        //Если в абстрактном методе более одного параметра, то их нужно всегда брать в скобки
        StudentHelper.checkStudentsWithComment(students, (student, string) -> {
            string.delete(0, string.length());
            string.append(" старше 20 лет");
            return student.getAge() > 20;
        });
        System.out.println("_________________________________________________________________________________________");

        //Лямбду можно присвоить в переменную
        StudentChecks checkAge = student -> student.getAge() < 25;
        StudentHelper.checkStudents(students, checkAge);
        System.out.println("_________________________________________________________________________________________");

        //Пример переопределения компаратора для объектов Student
        Collections.sort(students, (student1, student2) -> {
            if(!Objects.equals(student1.getAge(), student2.getAge())) {
                return student1.getAge() - student2.getAge();
            } else {
                return student1.getName().compareTo(student2.getName());
            }
        });
        System.out.println(students);
    }
}
