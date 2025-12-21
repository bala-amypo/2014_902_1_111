package com.example.demo.service.impl;

import com.example.demo.model.StudentProfile;
import com.example.demo.repository.StudentProfileRepository;
import com.example.demo.service.StudentProfileService;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentProfileServiceImpl implements StudentProfileService {

    private final StudentProfileRepository repository;

    public StudentProfileServiceImpl(StudentProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public StudentProfile createStudent(StudentProfile student) {
        if (repository.existsByEmail(student.getEmail())) {
            throw new IllegalArgumentException("email already exists");
        }
        student.setActive(true);
        return repository.save(student);
    }

    @Override
    public StudentProfile getStudentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("student not found"));
    }

    @Override
    public List<StudentProfile> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public StudentProfile updateStudent(Long id, StudentProfile student) {
        StudentProfile existing = getStudentById(id);

        existing.setFullName(student.getFullName());
        existing.setDepartment(student.getDepartment());
        existing.setYearLevel(student.getYearLevel());
        existing.setActive(student.getActive());

        return repository.save(existing);
    }
}
