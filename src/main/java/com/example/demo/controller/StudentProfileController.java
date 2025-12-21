package com.example.demo.controller;

import com.example.demo.model.StudentProfile;
import com.example.demo.service.StudentProfileService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentProfileController {

    private final StudentProfileService service;

    public StudentProfileController(StudentProfileService service) {
        this.service = service;
    }

    @PostMapping
    public StudentProfile create(@RequestBody StudentProfile s) {
        return service.createStudent(s);
    }

    @GetMapping("/{id}")
    public StudentProfile get(@PathVariable Long id) {
        return service.getStudentById(id);
    }
}
