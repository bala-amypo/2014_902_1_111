package com.example.demo.controller;

import com.example.demo.model.StudentProfile;
import com.example.demo.service.StudentProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentProfileController {

    private final StudentProfileService service;

    public StudentProfileController(StudentProfileService service) {
        this.service = service;
    }

    @PostMapping
    public StudentProfile create(@RequestBody StudentProfile student) {
        return service.createStudent(student);
    }

    @GetMapping("/{id}")
    public StudentProfile get(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @GetMapping
    public List<StudentProfile> all() {
        return service.getAllStudents();
    }
}
