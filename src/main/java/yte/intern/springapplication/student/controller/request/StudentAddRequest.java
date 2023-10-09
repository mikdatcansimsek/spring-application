package yte.intern.springapplication.student.controller.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import yte.intern.springapplication.student.entity.Student;

public record StudentAddRequest(
        @NotBlank
        String name,
        @NotBlank
        String surname,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Size(min = 11, max = 11)
        String tcKimlikNo,
        @NotBlank
        @Size(min = 7, max = 7)
        String studentNumber
) {

        public Student toEntity(){
                return new Student(name, surname, email, tcKimlikNo, studentNumber);
        }
}
