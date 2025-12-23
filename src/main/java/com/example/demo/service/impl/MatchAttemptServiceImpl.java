package com.example.demo.service.impl;

import com.example.demo.service.MatchAttemptService;
import org.springframework.stereotype.Service;

@Service
public class MatchAttemptServiceImpl implements MatchAttemptService {

    @Override
    public void logAttempt(Long studentAId, Long studentBId) {
        System.out.println("Match attempted between " + studentAId + " and " + studentBId);
    }
}
