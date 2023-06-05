package Helpers;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String name;
    private Character sex;
    private Integer age;
    private Double averageGrade;
    public Student(String name, char sex, int age, Double avaragrGrade){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.averageGrade = avaragrGrade;
    }

    public String getName() {
        return name;
    }

    public Character getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
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

    /*     Wrong override for example in EqualsAndHashCode.java
    @Override
    public int hashCode() {
        return (name.length() + age);
    }
    */

    public static void printStudentsArray(ArrayList<Student> arraylist) {
        for(Student s : arraylist) {
            System.out.println(s);
        }
    }
}
