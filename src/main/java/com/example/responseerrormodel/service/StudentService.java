package com.example.responseerrormodel.service;

import com.example.responseerrormodel.dto.GradeRequestDto;
import com.example.responseerrormodel.dto.StudentRequestDto;
import com.example.responseerrormodel.entity.Student;
import com.example.responseerrormodel.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentService {

    private final StudentRepository repository;

    public List<Student> getAll() {
        List<Student> students = repository.findAll(Sort.by(Sort.Direction.ASC, "grade"));
        log.info("Found {} students", students.size());
        return students;
    }

    public Student create(StudentRequestDto newStudent) {
        Student student = Student.builder()
                .name(newStudent.getName())
                .grade(Integer.valueOf(newStudent.getGrade()))
                .build();
        log.info("Create Student: " + student);
        return repository.save(student);
    }

    public List<Student> getStudentsByGrade(GradeRequestDto targetGrade) {
        GradeRequestDto target = GradeRequestDto.builder()
                .grade(targetGrade.getGrade())
                .build();

        List<Student> byGrade = repository.findByGrade(target.getGrade());
        log.info("target -> {} Found {} students", targetGrade, byGrade.size());
        return byGrade;
    }

}
