package com.example.demo.service.impl;

import com.example.demo.model.RoomAssignmentRecord;
import com.example.demo.repository.RoomAssignmentRecordRepository;
import com.example.demo.repository.StudentProfileRepository;
import com.example.demo.service.RoomAssignmentService;
import org.springframework.stereotype.Service;

@Service
public class RoomAssignmentServiceImpl
        implements RoomAssignmentService {

    private final RoomAssignmentRecordRepository roomRepo;
    private final StudentProfileRepository studentRepo;

    public RoomAssignmentServiceImpl(
            RoomAssignmentRecordRepository roomRepo,
            StudentProfileRepository studentRepo) {
        this.roomRepo = roomRepo;
        this.studentRepo = studentRepo;
    }

    @Override
    public RoomAssignmentRecord assignRoom(RoomAssignmentRecord record) {

        boolean activeA =
                studentRepo.findById(record.getStudentAId())
                        .get().getActive();
        boolean activeB =
                studentRepo.findById(record.getStudentBId())
                        .get().getActive();

        if (!activeA || !activeB) {
            throw new IllegalArgumentException("both students must be active");
        }

        return roomRepo.save(record);
    }
}
