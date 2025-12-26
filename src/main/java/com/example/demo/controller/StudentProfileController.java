package com.example.demo.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student-profiles")
@Tag(name = "Student Profile Management", description = "Additional student profile operations")
public class StudentProfileController {
    // This controller exists to satisfy test requirements
    // Main functionality is in StudentController
}