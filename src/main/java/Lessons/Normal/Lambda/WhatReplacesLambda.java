package Lessons.Normal.Lambda;

import Helpers.Students.Student;
import Helpers.Students.StudentChecks;
import Helpers.Students.StudentHelper;

import java.util.ArrayList;

public class WhatReplacesLambda {
    public static void main(String[] args) {

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

        //4
        StudentHelper.checkStudents(students, (Student student) -> {return student.getAge() < 25;});
    }
}
