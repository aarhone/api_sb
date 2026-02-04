package com.arh.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arh.api.dto.AddStudentRequestDto;
import com.arh.api.dto.StudentDto;
import com.arh.api.service.StudentService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;





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
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody @Valid AddStudentRequestDto addStudentRequestDto) {
     
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteStudnetById(@PathVariable Long id){
        studentService.deleteStudnet(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("students/{id}")
    public ResponseEntity<StudentDto> updateStudentById(@PathVariable Long id, @RequestBody @Valid AddStudentRequestDto addStudentRequestDto) {
        
        return ResponseEntity.ok(studentService.updateStudent(id, addStudentRequestDto));
    }
    
    @PatchMapping("students/{id}")
    public ResponseEntity<StudentDto> patchStudentById(@PathVariable Long id, @RequestBody @Valid  Map<String, Object> patchMap) {
        
        return ResponseEntity.ok(studentService.patchStudent(id, patchMap));
    }
    

}
