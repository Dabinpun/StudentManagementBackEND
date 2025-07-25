package com.example.StudentManagementBackEnd.repository;

import com.example.StudentManagementBackEnd.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
