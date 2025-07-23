package com.example.StudentManagementBackEnd.service;

import com.example.StudentManagementBackEnd.Model.Student;
import com.example.StudentManagementBackEnd.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Student> findById(int id){
        return studentRepo.findById(id);
    }

    public Student update(int id,Student student){
        Student studentToUpdate =studentRepo.findById(id).orElse(null);
        if(studentToUpdate != null){
            studentToUpdate.setName(student.getName());
            studentToUpdate.setSection(student.getSection());
            studentToUpdate.setEmail(student.getEmail());
            return studentRepo.save(studentToUpdate);
        }else {
            return null;
        }
    }
    public void delete(int id ){
        studentRepo.deleteById(id);
    }

}
