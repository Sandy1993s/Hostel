package com.example.Hostel.mapper;


import com.example.Hostel.dto.StudentDTO;
import com.example.Hostel.model.Student;

public class StudentMapper {
    public static StudentDTO toDTO(Student student) {
        StudentDTO dto = new StudentDTO();
        //dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setEmail(student.getEmail());
        dto.setRoomId(student.getRoom() != null ? student.getRoom().getId() : null);
        return dto;
    }

    public static Student toEntity(StudentDTO dto) {
        Student student = new Student();
        //student.setId(dto.getId());
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        // Note: You'll need to set Room manually in the service layer
        return student;
    }
}
