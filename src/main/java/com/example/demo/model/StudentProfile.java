package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class StudentProfile {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private String gender;

    @Enumerated(EnumType.STRING)
    private Role role = Role.STUDENT;

    // getters & setters
}
