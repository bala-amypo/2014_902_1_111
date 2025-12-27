package com.example.demo.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class StudentProfile {

    @NotBlank
    private String studentId;

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    private HabitProfile habitProfile;

    public StudentProfile() {}

    public StudentProfile(String studentId, String name, String email, HabitProfile habitProfile) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.habitProfile = habitProfile;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HabitProfile getHabitProfile() {
        return habitProfile;
    }

    public void setHabitProfile(HabitProfile habitProfile) {
        this.habitProfile = habitProfile;
    }
}
