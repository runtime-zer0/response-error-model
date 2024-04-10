package com.example.responseerrormodel.repository;

import com.example.responseerrormodel.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByGrade(int targetGrade);
}
