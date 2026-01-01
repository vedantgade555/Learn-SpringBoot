package com.kshtriya.youtube.LearningRestAPIs.controller;

import com.kshtriya.youtube.LearningRestAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // made from @Controller and @ResponseBody
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent() {
        return new StudentDto(101, "Anuj", "ved@555");
    }


    @GetMapping("/student/{id}")
    public StudentDto getStudentById(){
        return new StudentDto(101,"Anuj","ved@555");
    }

}
