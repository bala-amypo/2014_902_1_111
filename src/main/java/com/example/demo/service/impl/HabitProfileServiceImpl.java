package com.example.demo.service.impl;

import com.example.demo.model.HabitProfile;
import com.example.demo.service.HabitProfileService;
import org.springframework.stereotype.Service;

@Service
public class HabitProfileServiceImpl implements HabitProfileService {

    @Override
    public HabitProfile save(HabitProfile habit) {
        if (habit.getStudyHoursPerDay() < 0) {
            throw new IllegalArgumentException("Study hours cannot be negative");
        }
        return habit;
    }
}
