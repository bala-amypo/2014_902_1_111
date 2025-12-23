package com.example.demo.model;

public class CompatibilityScoreRecord {

    private Long studentAId;
    private Long studentBId;
    private double score;
    private String compatibilityLevel;

    public Long getStudentAId() {
        return studentAId;
    }

    public void setStudentAId(Long studentAId) {
        this.studentAId = studentAId;
    }

    public Long getStudentBId() {
        return studentBId;
    }

    public void setStudentBId(Long studentBId) {
        this.studentBId = studentBId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getCompatibilityLevel() {
        return compatibilityLevel;
    }

    public void setCompatibilityLevel(String compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
    }
}
