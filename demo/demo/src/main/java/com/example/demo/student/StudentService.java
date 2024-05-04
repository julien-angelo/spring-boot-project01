package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentrepository;

    @Autowired
    public StudentService(StudentRepository studentrepository) {
        this.studentrepository = studentrepository;
    }


    public List<Student> getStudents(){
        return studentrepository.findAll();
    }
}
