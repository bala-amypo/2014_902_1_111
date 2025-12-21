package com.example.demo.service;

import com.example.demo.model.MatchAttemptRecord;
import com.example.demo.repository.MatchAttemptRecordRepository;
import org.springframework.stereotype.Service;

@Service
public class MatchAttemptService {

    private final MatchAttemptRecordRepository repo;

    public MatchAttemptService(MatchAttemptRecordRepository repo) {
        this.repo = repo;
    }

    public MatchAttemptRecord logMatchAttempt(MatchAttemptRecord r) {
        return repo.save(r);
    }
}
