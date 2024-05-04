package com.example.demo.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L,"Jude Mary","judemary@gmail.com",LocalDate.of(2000, Month.JULY,9),23),
                new Student(2L,"Mary Anne","maryanne@gmail.com",LocalDate.of(1998,Month.SEPTEMBER,4),25),
                new Student(3L,"Sam Curran","samcurran@gmail.com",LocalDate.of(2001,Month.MARCH,9),23)
        );
    }
}
