package com.shubham.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private record Student(
            String name,
            String address
    ){}

    List<Student>  students = new ArrayList<>(
            List.of(
                    new Student("Shubham","Sillod"),
                    new Student("Vishal", "Shinde")
            )
    );

    @GetMapping("/")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping("/")
    public Student student(@RequestBody Student student){
        students.add(student);
        return student;
    }
    
}
