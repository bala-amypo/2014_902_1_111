package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RoomAssignmentRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomNumber;
    private Long studentAId;
    private Long studentBId;
    private LocalDateTime assignedAt;
    private String status;

    public RoomAssignmentRecord() {
        this.assignedAt = LocalDateTime.now();
    }

    // getters and setters
}
