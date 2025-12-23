package com.example.demo.controller;

import com.example.demo.model.MatchAttemptRecord;
import com.example.demo.service.MatchAttemptService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/match-attempts")
public class MatchAttemptController {

    private final MatchAttemptService service;

    public MatchAttemptController(MatchAttemptService service) {
        this.service = service;
    }

    @PostMapping
    public MatchAttemptRecord log(@RequestBody MatchAttemptRecord record) {
        return service.logMatchAttempt(record);
    }
}
