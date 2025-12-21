package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.entity.*;

@Service
public class CompatibilityService {

    public int calculateScore(HabitProfile a, HabitProfile b) {
        int score = 100;
        score -= Math.abs(a.getSleepHours() - b.getSleepHours()) * 5;
        score -= Math.abs(a.getStudyHours() - b.getStudyHours()) * 5;
        return Math.max(score, 0);
    }

    public String level(int score) {
        if (score > 80) return "HIGH";
        if (score > 50) return "MEDIUM";
        return "LOW";
    }
}
