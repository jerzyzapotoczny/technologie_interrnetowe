package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {

    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                            Student Adam = new Student(
                                    "Adam",
                                    "adam@gmail.com",
                                    LocalDate.of(2000, Month.JANUARY, 1));

                };
    }
}