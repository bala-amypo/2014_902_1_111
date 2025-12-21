package com.example.demo.controller;

import com.example.demo.model.StudentProfile;
import com.example.demo.service.StudentProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentProfileService studentService;

    public StudentController(StudentProfileService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentProfile createStudent(@RequestBody StudentProfile student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/{id}")
    public StudentProfile getStudent(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping
    public List<StudentProfile> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/{id}")
    public StudentProfile updateStudent(
            @PathVariable Long id,
            @RequestBody StudentProfile student) {
        return studentService.updateStudent(id, student);
    }
}
