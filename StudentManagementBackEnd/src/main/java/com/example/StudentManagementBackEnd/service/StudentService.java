package com.example.StudentManagementBackEnd.service;

import com.example.StudentManagementBackEnd.Model.Student;
import com.example.StudentManagementBackEnd.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> findAll(){
        return studentRepo.findAll();
    }

    public Student create(Student student){
        return studentRepo.save(student);
    }
}
