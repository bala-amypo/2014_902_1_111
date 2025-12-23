package com.example.demo.service.impl;

import com.example.demo.model.RoomAssignmentRecord;
import com.example.demo.service.RoomAssignmentService;
import org.springframework.stereotype.Service;

@Service
public class RoomAssignmentServiceImpl implements RoomAssignmentService {

    @Override
    public RoomAssignmentRecord assign(RoomAssignmentRecord record) {
        System.out.println(
            "Room assigned to " +
            record.getStudentAId() + " and " + record.getStudentBId()
        );
        return record;
    }
}
