package com.example.demo.service;

import com.example.demo.model.StudentProfile;
import java.util.List;

public interface StudentProfileService {

    StudentProfile addStudent(StudentProfile student);
    List<StudentProfile> getAllStudents();
    StudentProfile updateStudent(Long id, StudentProfile student);
    void deactivateStudent(Long id);
}
