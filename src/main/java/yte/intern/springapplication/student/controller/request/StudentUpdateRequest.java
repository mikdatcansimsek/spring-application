package yte.intern.springapplication.student.controller.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record StudentUpdateRequest(
        @NotBlank
        String name,
        @NotBlank
        String surname,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Size(min = 7, max = 7)
        String studentNumber
) {
}
