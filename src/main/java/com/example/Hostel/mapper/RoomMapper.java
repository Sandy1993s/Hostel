package com.example.Hostel.mapper;

import com.example.Hostel.dto.RoomDTO;
import com.example.Hostel.model.Room;

public class RoomMapper {
    public static RoomDTO toDTO(Room room) {
        RoomDTO dto = new RoomDTO();

        dto.setRoomNumber(room.getRoomNumber());
        dto.setCapacity(room.getCapacity());
        //dto.setStudentIds(room.getStudents() != null ? room.getStudents().getId() : null);
        return dto;
    }

    public static Room toEntity(RoomDTO dto) {
        Room student = new Room();

        student.setCapacity(dto.getCapacity());
        student.setRoomNumber(dto.getRoomNumber());
        // Note: You'll need to set Room manually in the service layer
        return student;
    }
}
