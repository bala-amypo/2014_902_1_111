package com.example.demo.service.impl;

import com.example.demo.model.CompatibilityScoreRecord;
import com.example.demo.model.HabitProfile;
import com.example.demo.repository.CompatibilityScoreRecordRepository;
import com.example.demo.repository.HabitProfileRepository;
import com.example.demo.service.CompatibilityScoreService;
import org.springframework.stereotype.Service;

@Service
public class CompatibilityScoreServiceImpl
        implements CompatibilityScoreService {

    private final CompatibilityScoreRecordRepository scoreRepo;
    private final HabitProfileRepository habitRepo;

    public CompatibilityScoreServiceImpl(
            CompatibilityScoreRecordRepository scoreRepo,
            HabitProfileRepository habitRepo) {
        this.scoreRepo = scoreRepo;
        this.habitRepo = habitRepo;
    }

    @Override
    public CompatibilityScoreRecord calculateScore(Long a, Long b) {

        if (a.equals(b)) {
            throw new IllegalArgumentException("same student");
        }

        HabitProfile ha = habitRepo.findByStudentId(a);
        HabitProfile hb = habitRepo.findByStudentId(b);

        double score =
                100 - Math.abs(
                        ha.getStudyHoursPerDay() - hb.getStudyHoursPerDay());

        CompatibilityScoreRecord record =
                new CompatibilityScoreRecord();

        record.setStudentAId(a);
        record.setStudentBId(b);
        record.setScore(score);
        record.setCompatibilityLevel(
                score >= 75 ? "HIGH" : "LOW");

        return scoreRepo.save(record);
    }
}
