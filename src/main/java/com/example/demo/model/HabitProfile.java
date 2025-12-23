package com.example.demo.model;

public class HabitProfile {

    private Long studentId;
    private int studyHoursPerDay;
    private String sleepSchedule;
    private String cleanlinessLevel;
    private String noiseTolerance;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public int getStudyHoursPerDay() {
        return studyHoursPerDay;
    }

    public void setStudyHoursPerDay(int studyHoursPerDay) {
        this.studyHoursPerDay = studyHoursPerDay;
    }

    public String getSleepSchedule() {
        return sleepSchedule;
    }

    public void setSleepSchedule(String sleepSchedule) {
        this.sleepSchedule = sleepSchedule;
    }

    public String getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(String cleanlinessLevel) {
        this.cleanlinessLevel = cleanlinessLevel;
    }

    public String getNoiseTolerance() {
        return noiseTolerance;
    }

    public void setNoiseTolerance(String noiseTolerance) {
        this.noiseTolerance = noiseTolerance;
    }
}
