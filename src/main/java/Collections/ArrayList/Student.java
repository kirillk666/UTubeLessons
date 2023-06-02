package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    String name;
    Character sex;
    Integer age;
    Double averageGrade;
    public Student(String name, char sex, int age, Double avaragrGrade){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.averageGrade = avaragrGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(sex, student.sex) && Objects.equals(age, student.age) && Objects.equals(averageGrade, student.averageGrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, averageGrade);
    }


    public static void printStudentsArray(ArrayList<Student> arraylist) {
        for(Student s : arraylist) {
            System.out.println(s);
        }
    }
}
