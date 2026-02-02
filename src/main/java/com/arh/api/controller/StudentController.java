package com.arh.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.arh.api.dto.StudentDto;
import com.arh.api.service.StudentService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.arh.api.dto.AddStudentRequestDto;




// creating api here.

// Rest for creating bean.
@RestController
@RequiredArgsConstructor
public class StudentController {

    // doing DI and creating obj
    private final StudentService studentService;

    // this api will return students but an student object that shld be DTO (DATA transfer object).
    // auto give the response in json format coz of @RestController
    // ResponseEntity for status code and proper API response
    @GetMapping("/students")
    public ResponseEntity<List<StudentDto>> getalltudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentbyId(id));
    }

    @PostMapping("/students")
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody AddStudentRequestDto addStudentRequestDto) {
     
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteStudnet(@PathVariable Long id){
        studentService.deleteStudnetById(id);
        return ResponseEntity.noContent().build();
    }
    
    

}
