package LessonsUtube.Helpers;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private Character sex;
    private Integer age;
    private Double averageGrade;
    public Student(String name, char sex, int age, Double averageGrade){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.averageGrade = averageGrade;
    }

    public Student(String name, char sex, int age){
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    //Если переопределены методы equals/hashCode и compareTo, то эти методы должны сравнивать одинаково, по всем полям.
    @Override
    public int compareTo(Student o) {
        int result;
        if(averageGrade != null && !Objects.equals(this.averageGrade, o.averageGrade)) {
            result = this.averageGrade.compareTo(o.getAverageGrade());
        } else if (!Objects.equals(this.age, o.age)){
            result = this.age.compareTo(o.age);
        } else if (!Objects.equals(this.name, o.name)){
            result = this.name.compareTo(o.name);
        } else {
            result = this.sex.compareTo(o.sex);
        }
        return result;
    }
}
