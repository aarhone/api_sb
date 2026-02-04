package com.arh.api.service;
import java.util.List;
import java.util.Map;

import com.arh.api.dto.AddStudentRequestDto;
import com.arh.api.dto.StudentDto;

public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto getStudentbyId(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudnet(Long id);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);

    StudentDto patchStudent(Long id, Map<String, Object> patchMap);
}