package com.example.demo.service;

import com.example.demo.model.HabitProfile;
import com.example.demo.repository.HabitProfileRepository;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class HabitProfileService {

    private final HabitProfileRepository repo;

    public HabitProfileService(HabitProfileRepository repo) {
        this.repo = repo;
    }

    public HabitProfile createOrUpdateHabit(HabitProfile habit) {
        if (habit.getStudyHoursPerDay() < 0) {
            throw new IllegalArgumentException("study hours");
        }
        return repo.save(habit);
    }

    public HabitProfile getHabitByStudent(Long studentId) {
        HabitProfile h = repo.findByStudentId(studentId);
        if (h == null) throw new ResourceNotFoundException("not found");
        return h;
    }
}
