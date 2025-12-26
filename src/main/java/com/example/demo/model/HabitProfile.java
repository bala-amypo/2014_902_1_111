package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class HabitProfile {

    @Id
    @GeneratedValue
    private Long id;

    private int sleepTime;
    private int studyHours;
    private int cleanliness;
    private int noiseTolerance;
    private int socialLevel;
}
