package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class HabitProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int sleepHours;
    private int studyHours;
    private int cleanliness;
    private int noiseTolerance;
    private String socialPreference;

    @OneToOne
    private Student student;
}
