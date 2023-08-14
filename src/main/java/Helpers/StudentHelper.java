package Helpers;

import java.util.ArrayList;

public class StudentHelper {
    public static void printStudentsArray(ArrayList<Student> arraylist) {
        for (Student s : arraylist) {
            System.out.println(s);
        }
    }

    public static void printStudentOverGrade(ArrayList<Student> students, double averageGrade) {
        for (Student student : students) {
            if (student.getAverageGrade() >= averageGrade) {
                System.out.println(student);
            } else {
                System.out.println(student.getName() + " doesn't match");
            }
        }
    }

    public static void printStudentUnderAge(ArrayList<Student> students, int age) {
        for (Student student : students) {
            if (student.getAge() < age) {
                System.out.println(student);
            } else {
                System.out.println(student.getName() + " doesn't match");
            }
        }
    }

    public static void printStudentMixedCondition(ArrayList<Student> students, int age, double averageGrade, char sex) {
        for (Student student : students) {
            if (student.getAverageGrade() >= averageGrade && student.getAge() < age && student.getSex() == sex) {
                System.out.println(student);
            } else {
                System.out.println(student.getName() + " doesn't match");
            }
        }
    }
}
