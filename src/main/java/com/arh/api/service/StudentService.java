package com.arh.api.service;
import java.util.List;

import com.arh.api.dto.AddStudentRequestDto;
import com.arh.api.dto.StudentDto;

public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto getStudentbyId(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudnetById(Long id);
}