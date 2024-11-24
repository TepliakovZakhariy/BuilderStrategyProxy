package ua.edu.ucu.apps.task1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.task1.Student.StudentBuilder;

public class StudentTests {
    
    @Test
    public void StudentTest() {
        StudentBuilder studentBuilder = Student.builder();

        Student student = studentBuilder.email("test@test").build();

        assertEquals(student.getEmail(), "test@test");

        student = studentBuilder.courses(List.of("New course")).course("New course 2").firstName("John").lastName("Doe").age(31).build();

        assertEquals(student.getCourses(), List.of("New course", "New course 2"));
        assertEquals(student.getFirstName(), "John");
        assertEquals(student.getLastName(), "Doe");
        assertEquals(student.getAge(), 31);
        assertEquals(student.getEmail(), "test@test");

    }
}
