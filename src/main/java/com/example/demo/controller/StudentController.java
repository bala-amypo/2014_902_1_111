package com.example.demo.controller;

import com.example.demo.model.StudentProfile;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository repository;
    private final MatchService matchService;

    public StudentController(StudentRepository repository, MatchService matchService) {
        this.repository = repository;
        this.matchService = matchService;
    }

    // Add student
    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody Student student) {

        if (repository.existsById(student.getStudentId())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Student ID already exists");
        }

        if (repository.existsByEmail(student.getEmail())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Email already exists");
        }

        repository.save(student);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Student added successfully");
    }

    // Compatibility check
    @GetMapping("/match")
    public ResponseEntity<Integer> match(
            @RequestParam String id1,
            @RequestParam String id2) {

        Student s1 = repository.findById(id1);
        Student s2 = repository.findById(id2);

        if (s1 == null || s2 == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        int score = matchService.calculateCompatibility(s1, s2);
        return ResponseEntity.ok(score);
    }
}
