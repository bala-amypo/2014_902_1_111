package com.example.demo.controller;

import com.example.demo.model.StudentProfile;
import com.example.demo.service.StudentProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentProfileService studentService;

    public StudentController(StudentProfileService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentProfile add(@RequestBody StudentProfile student) {
        return studentService   .addStudent(student);
    }

    @GetMapping
    public List<StudentProfile> all() {
        return studentService.getAllStudents();
    }

    @PutMapping("/{id}")
    public StudentProfile update(@PathVariable Long id, @RequestBody StudentProfile student) {
        return studentService.updateStudent(id, student);
    }
}
