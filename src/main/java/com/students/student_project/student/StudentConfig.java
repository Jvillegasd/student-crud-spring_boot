package com.students.student_project.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
  
  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student lisa = new Student(
        "Lisa",
        "lisa@blackpink.com",
        LocalDate.of(1997, Month.MARCH, 27)
      );

      Student soyeon = new Student(
        "Soyeon",
        "soyeon@gidle.com",
        LocalDate.of(1998, Month.AUGUST, 26)
      );

      repository.saveAll(
        List.of(lisa, soyeon)
      );
    };
  }
}
