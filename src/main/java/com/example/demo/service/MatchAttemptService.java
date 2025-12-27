package com.example.demo.service;

import com.example.demo.model.HabitProfile;
import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

@Service
public class MatchService {

    public int calculateCompatibility(Student s1, Student s2) {
        HabitProfile h1 = s1.getHabitProfile();
        HabitProfile h2 = s2.getHabitProfile();

        int diff =
                Math.abs(h1.getSleepTime() - h2.getSleepTime()) +
                Math.abs(h1.getStudyHours() - h2.getStudyHours()) +
                Math.abs(h1.getCleanliness() - h2.getCleanliness()) +
                Math.abs(h1.getNoiseTolerance() - h2.getNoiseTolerance()) +
                Math.abs(h1.getSocialPreference() - h2.getSocialPreference());

        return 100 - diff;
    }
}
