package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//Notes
//This class is the controller which handles the API layer

//rest controller : enables class to serve REST endpoints
@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private final StudentService studentservice;

    public StudentController(StudentService studentservice){
        this.studentservice = studentservice;
    };

    //REST endpoint
    @GetMapping
    public List<Student> getStudents(){
        return studentservice.getStudents();
    }

}
