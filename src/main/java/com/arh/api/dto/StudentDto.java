package com.arh.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// its an defination or data structure of objs DATA is used for auto creating getter setter, equals for the vaules.
// All args constructor creates and constutor will all the fileds defined in dto class.

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private Long id;
    private String name;
    private String email;

}
