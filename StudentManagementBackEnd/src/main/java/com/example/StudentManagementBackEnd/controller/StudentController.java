package com.example.StudentManagementBackEnd.controller;

import com.example.StudentManagementBackEnd.Model.Student;
import com.example.StudentManagementBackEnd.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
    StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/api/v1/students")
    public List<Student>findAll(){
        return studentService.findAll();

    }

    @PostMapping("/api/v1/students")

    public Student Create(@RequestBody Student student){
        return studentService.create(student);
    }


}
