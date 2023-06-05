package Helpers;

import java.util.Objects;

final class StudentsMarksForMathFinal {
    private final String name;
    private final String surname;
    private final Integer mark;

    public StudentsMarksForMathFinal(String name, String surname, Integer mark){
        this.name = name;
        this.surname = surname;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getMark() {
        return mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsMarksForMathFinal that = (StudentsMarksForMathFinal) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(mark, that.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, mark);
    }

    @Override
    public String toString() {
        return "StudentsMarksForMathFinal{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mark=" + mark +
                '}';
    }
}
