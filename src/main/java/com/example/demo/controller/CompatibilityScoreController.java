package com.example.demo.controller;

import com.example.demo.model.CompatibilityScoreRecord;
import com.example.demo.service.CompatibilityScoreService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compatibility")
public class CompatibilityScoreController {

    private final CompatibilityScoreService service;

    public CompatibilityScoreController(CompatibilityScoreService service) {
        this.service = service;
    }

    @PostMapping("/compute/{a}/{b}")
    public CompatibilityScoreRecord compute(
            @PathVariable Long a,
            @PathVariable Long b) {
        return service.computeScore(a, b);
    }
}
