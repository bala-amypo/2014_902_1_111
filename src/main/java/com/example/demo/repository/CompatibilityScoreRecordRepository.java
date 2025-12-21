package com.example.demo.repository;

import com.example.demo.model.CompatibilityScoreRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompatibilityScoreRecordRepository
        extends JpaRepository<CompatibilityScoreRecord, Long> {

    CompatibilityScoreRecord findByStudentAIdAndStudentBId(Long id1, Long id2);
}
