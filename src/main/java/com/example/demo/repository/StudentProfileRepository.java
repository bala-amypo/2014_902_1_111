package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository {

    private final Map<String, Student> studentMap = new HashMap<>();

    public void save(Student student) {
        studentMap.put(student.getStudentId(), student);
    }

    public boolean existsById(String id) {
        return studentMap.containsKey(id);
    }

    public boolean existsByEmail(String email) {
        return studentMap.values().stream()
                .anyMatch(s -> s.getEmail().equalsIgnoreCase(email));
    }

    public Student findById(String id) {
        return studentMap.get(id);
    }

    public Collection<Student> findAll() {
        return studentMap.values();
    }
}
