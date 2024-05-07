package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student mariam = new Student("mariam","mariam@gmail.com", LocalDate.of(2000, JANUARY,21),21);
          Student alex = new Student("alex","alex@gmail.com", LocalDate.of(1998, JANUARY,21),25);

          repository.saveAll(List.of(mariam,alex));

        };
    }

}
