package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import org.springframework.stereotype.Service;

@Service
public class CompatibilityScoreService {

    private final CompatibilityScoreRecordRepository scoreRepo;
    private final HabitProfileRepository habitRepo;

    public CompatibilityScoreService(
            CompatibilityScoreRecordRepository scoreRepo,
            HabitProfileRepository habitRepo) {
        this.scoreRepo = scoreRepo;
        this.habitRepo = habitRepo;
    }

    public CompatibilityScoreRecord computeScore(Long a, Long b) {
        if (a.equals(b)) {
            throw new IllegalArgumentException("same student");
        }

        HabitProfile ha = habitRepo.findByStudentId(a);
        HabitProfile hb = habitRepo.findByStudentId(b);

        if (ha == null || hb == null) {
            throw new IllegalArgumentException("not found");
        }

        double score = 100 - Math.abs(
                ha.getStudyHoursPerDay() - hb.getStudyHoursPerDay());

        CompatibilityScoreRecord rec = new CompatibilityScoreRecord();
        rec.setStudentAId(a);
        rec.setStudentBId(b);
        rec.setScore(score);
        rec.setCompatibilityLevel(score > 80 ? "HIGH" : "LOW");

        return scoreRepo.save(rec);
    }
}
