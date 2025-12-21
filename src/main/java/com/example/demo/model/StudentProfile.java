package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String studentId;

    @Column(unique = true)
    private String email;

    private String fullName;
    private String department;
    private Integer yearLevel;
    private Boolean active;
    private LocalDateTime createdAt;

    public StudentProfile() {
        this.createdAt = LocalDateTime.now();
        this.active = true;
    }

    // getters and setters
}
