package Lessons.Normal.Lambda;

import Helpers.Student;
import Helpers.StudentHelper;

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

        StudentHelper.printStudentOverGrade(students, 4.00);


    }
}
