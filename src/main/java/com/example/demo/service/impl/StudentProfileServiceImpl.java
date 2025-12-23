package com.example.demo.service.impl;

import com.example.demo.model.StudentProfile;
import com.example.demo.service.StudentProfileService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentProfileServiceImpl implements StudentProfileService {

    private final List<StudentProfile> students = new ArrayList<>();

    @Override
    public StudentProfile addStudent(StudentProfile student) {
        student.setActive(true);
        students.add(student);
        return student;
    }

    @Override
    public List<StudentProfile> getAllStudents() {
        return students;
    }

    @Override
    public StudentProfile updateStudent(Long id, StudentProfile updated) {
        for (StudentProfile s : students) {
            if (s.getStudentId().equals(id)) {
                s.setFullName(updated.getFullName());
                s.setDepartment(updated.getDepartment());
                s.setYearLevel(updated.getYearLevel());
                return s;
            }
        }
        return null;
    }

    @Override
    public void deactivateStudent(Long id) {
        for (StudentProfile s : students) {
            if (s.getStudentId().equals(id)) {
                s.setActive(false);
            }
        }
    }
}
