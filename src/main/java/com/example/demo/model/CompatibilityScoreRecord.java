package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class CompatibilityScoreRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentAId;
    private Long studentBId;
    private Double score;
    private String compatibilityLevel;
    private LocalDateTime computedAt;
    private String detailsJson;

    public CompatibilityScoreRecord() {
        this.computedAt = LocalDateTime.now();
    }

    // getters and setters
}
