package com.arh.api.service.implementation;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.arh.api.dto.AddStudentRequestDto;
import com.arh.api.dto.StudentDto;
import com.arh.api.entity.Student;
import com.arh.api.repository.StudentRepository;
import com.arh.api.service.StudentService;

import lombok.RequiredArgsConstructor;


// talks to repository i.e persistance layer to fetch data and convert it into dto obj that is used by controller.

@Service
@RequiredArgsConstructor // create DI for all private final var
public class StudentImpl implements StudentService {

    // Doing DI and creating obj.
    private final StudentRepository studentRepository; 
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudents(){

        

        List<Student> allstudents = studentRepository.findAll();

        // we can manually convert  all the Student type values to StudentDto obj.
        // allstudents.stream().map(s -> new StudentDto(s.getId(), s.getName(), s.getEmail).toList());

        // List<StudentDto> students = new ArrayList<>();
        // for (Student s : allstudents){
        //     students.add(modmapobj.map(s, StudentDto.class));
        // } 

        // return allstudents;

        // better than looping and conveting the entity obj to dto obj via model mapper
        return allstudents.stream().map(s -> modelMapper.map(s, StudentDto.class)).toList();


    }

    @Override
    public StudentDto getStudentbyId(Long id){
        Student s = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with ID: "+id));
        return modelMapper.map(s, StudentDto.class);

    }

    @Override
    public StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto) {

        Student newStudent = modelMapper.map(addStudentRequestDto, Student.class);
        Student s = studentRepository.save(newStudent);

        return modelMapper.map(s, StudentDto.class);

    }

    @Override
    public void deleteStudnetById(Long id){
        if(!studentRepository.existsById(id)){
            throw new IllegalArgumentException("Student does not exists by id: "+id);
        }
        studentRepository.deleteById(id);
    }

}
