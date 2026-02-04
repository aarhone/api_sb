package com.arh.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class AddStudentRequestDto {

    @NotBlank
    @Size(min=3, max=30, message="Enter the name within 3 to 30 range.")
    String name;
    
    @Email
    @NotBlank(message="Email is required.")
    String email;
}
