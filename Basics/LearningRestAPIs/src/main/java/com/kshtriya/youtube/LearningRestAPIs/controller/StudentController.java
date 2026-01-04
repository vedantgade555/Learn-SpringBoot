package com.kshtriya.youtube.LearningRestAPIs.controller;

import com.kshtriya.youtube.LearningRestAPIs.dto.StudentDto;
import com.kshtriya.youtube.LearningRestAPIs.entity.Student;
import com.kshtriya.youtube.LearningRestAPIs.repository.StudentRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController  // made from @Controller and @ResponseBody
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }


//    @GetMapping("/student/{id}")
//    public StudentDto getStudentById(){
//        return new StudentDto(101,"Anuj","ved@555");
//    }

}
