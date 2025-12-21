package com.example.demo.service;

import com.example.demo.model.RoomAssignmentRecord;
import com.example.demo.repository.RoomAssignmentRecordRepository;
import com.example.demo.repository.StudentProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomAssignmentService {

    private final RoomAssignmentRecordRepository repo;
    private final StudentProfileRepository studentRepo;

    public RoomAssignmentService(
            RoomAssignmentRecordRepository repo,
            StudentProfileRepository studentRepo) {
        this.repo = repo;
        this.studentRepo = studentRepo;
    }

    public RoomAssignmentRecord assignRoom(RoomAssignmentRecord r) {
        if (!studentRepo.findById(r.getStudentAId()).get().getActive()
         || !studentRepo.findById(r.getStudentBId()).get().getActive()) {
            throw new IllegalArgumentException("both students must be active");
        }
        return repo.save(r);
    }
}
