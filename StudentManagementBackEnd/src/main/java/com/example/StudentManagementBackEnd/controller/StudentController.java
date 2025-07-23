package com.example.StudentManagementBackEnd.controller;

import com.example.StudentManagementBackEnd.Model.Student;
import com.example.StudentManagementBackEnd.service.StudentService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/students")
public class StudentController {
    StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student>findAll(){
        return studentService.findAll();

    }

    @PostMapping
    public Student Create(@RequestBody Student student){
        return studentService.create(student);
    }

    @GetMapping("/{id}")
    public Optional <Student> getStudent(@PathVariable int id, @RequestBody Student student){
        return studentService.findById(id);
    }

    @PutMapping("{id}")
    public  Student update(@PathVariable int id, @RequestBody Student student){
        return studentService.update(id,student);
    }


}
