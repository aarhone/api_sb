package com.arh.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class AddStudentRequestDto {
    String name;
    String email;
}
