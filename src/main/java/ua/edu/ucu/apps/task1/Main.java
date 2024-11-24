package ua.edu.ucu.apps.task1;

import ua.edu.ucu.apps.task1.Student.StudentBuilder;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = Student.builder();

        Student student = studentBuilder.courses(List.of("New course")).course("New course 2").firstName("John").lastName("Doe").age(31).email("test@test").build();

        System.out.println(student);

    }
}
