package LessonsUtube.Helpers;

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

    public static void checkStudents(ArrayList<Student> students, StudentChecks checks) {
        for (Student student : students) {
            if (checks.check(student)) {
                System.out.println(student);
            } else {
                System.out.println(student.getName() + " doesn't match");
            }
        }
    }

    public static void checkStudentsWithComment(ArrayList<Student> students, StudentChecksWithTwoParameters checks) {
        StringBuilder comment = new StringBuilder();
        for (Student student : students) {
            if (checks.checkWithTwoParameters(student, comment)) {
                System.out.println(student + " " + comment);
            } else {
                System.out.println(student.getName() + " doesn't match");
            }
        }
    }

    public static class CheckStudentsUnderAge implements StudentChecks {
        @Override
        public boolean check(Student student) {
            return student.getAge() < 25;
        }
    }

    public static class CheckStudentsOverGrade implements StudentChecks {
        @Override
        public boolean check(Student student) {
            return student.getAverageGrade() > 4.00;
        }
    }
}