package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MatchAttemptRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long initiatorStudentId;
    private Long candidateStudentId;
    private Long resultScoreId;
    private String status;
    private LocalDateTime attemptedAt;

    public MatchAttemptRecord() {
        this.attemptedAt = LocalDateTime.now();
    }

    // getters and setters
}
