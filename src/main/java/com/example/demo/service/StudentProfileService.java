package com.example.demo.service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.StudentProfile;
import com.example.demo.repository.StudentProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentProfileService {

    private final StudentProfileRepository repo;

    public StudentProfileService(StudentProfileRepository repo) {
        this.repo = repo;
    }

    public StudentProfile createStudent(StudentProfile profile) {
        if (repo.findByStudentId(profile.getStudentId()) != null) {
            throw new IllegalArgumentException("studentId exists");
        }
        return repo.save(profile);
    }

    public StudentProfile getStudentById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("not found"));
    }
}
