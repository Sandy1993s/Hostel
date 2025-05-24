package com.example.Hostel.controller;


import com.example.Hostel.dto.RoomDTO;
import com.example.Hostel.model.Room;
import com.example.Hostel.repository.RoomRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    private final RoomRepository repo;

    public RoomController(RoomRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Room> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Room create(@RequestBody RoomDTO  roomDTO) {
        Room room = new Room();
        room.setRoomNumber(roomDTO.getRoomNumber());
        room.setCapacity(roomDTO.getCapacity());
        return repo.save(room);
    }
}
