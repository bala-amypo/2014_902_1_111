package com.example.demo.service.impl;

import com.example.demo.model.CompatibilityScoreRecord;
import com.example.demo.model.HabitProfile;
import com.example.demo.service.CompatibilityScoreService;
import org.springframework.stereotype.Service;

@Service
public class CompatibilityScoreServiceImpl implements CompatibilityScoreService {

    @Override
    public CompatibilityScoreRecord calculate(
            Long studentAId,
            Long studentBId,
            HabitProfile a,
            HabitProfile b) {

        double score = 100 - Math.abs(
                a.getStudyHoursPerDay() - b.getStudyHoursPerDay()) * 10;

        CompatibilityScoreRecord record = new CompatibilityScoreRecord();
        record.setStudentAId(studentAId);
        record.setStudentBId(studentBId);
        record.setScore(score);
        record.setCompatibilityLevel(score >= 70 ? "HIGH" : "LOW");

        return record;
    }
}
