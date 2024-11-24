package ua.edu.ucu.apps.task1;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
    @Singular private List<String> courses;

    // public static class StudentBuilder {
    //     private Student student;

    //     public StudentBuilder() {
    //         student = new Student();
    //     }

    //     public StudentBuilder firstName(String firstName) {
    //         student.firstName = firstName;
    //         return this;
    //     }

    //     public StudentBuilder lastName(String lastName) {
    //         student.lastName = lastName;
    //         return this;
    //     }
    // }

}
