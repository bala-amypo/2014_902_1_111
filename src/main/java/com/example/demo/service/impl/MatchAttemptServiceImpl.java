package com.example.demo.service.impl;

import com.example.demo.model.MatchAttemptRecord;
import com.example.demo.service.MatchAttemptService;
import org.springframework.stereotype.Service;

@Service
public class MatchAttemptServiceImpl implements MatchAttemptService {

    @Override
    public MatchAttemptRecord logMatchAttempt(MatchAttemptRecord record) {
        System.out.println(
            "Match attempt: " +
            record.getStudentAId() + " & " + record.getStudentBId()
        );
        return record;
    }
}
