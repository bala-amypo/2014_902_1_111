package com.example.demo.model;

public class HabitProfile {

    private int sleepTime;
    private int studyHours;
    private int cleanliness;
    private int noiseTolerance;
    private int socialPreference;

    public HabitProfile() {}

    public int getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    public int getStudyHours() {
        return studyHours;
    }

    public void setStudyHours(int studyHours) {
        this.studyHours = studyHours;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public int getNoiseTolerance() {
        return noiseTolerance;
    }

    public void setNoiseTolerance(int noiseTolerance) {
        this.noiseTolerance = noiseTolerance;
    }

    public int getSocialPreference() {
        return socialPreference;
    }

    public void setSocialPreference(int socialPreference) {
        this.socialPreference = socialPreference;
    }
}
