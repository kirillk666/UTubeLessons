package LessonsUtube.Helpers;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Faculty {
    String name;
    @Getter
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public void addStudentsToFaculty(Student... student) {
        studentsOnFaculty.addAll(Arrays.asList(student));
    }
}
