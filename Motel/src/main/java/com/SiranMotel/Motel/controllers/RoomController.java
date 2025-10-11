package com.SiranMotel.Motel.controllers;

import com.SiranMotel.Motel.dtos.RoomDTO;
import com.SiranMotel.Motel.services.RoomService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/room")

public class RoomController {

    private final RoomService roomService;

    public RoomController( RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping
    public ResponseEntity<RoomDTO> createRoom(@RequestBody RoomDTO input) {
        RoomDTO roomDTO = roomService.createRoom(input);
        return ResponseEntity.ok(roomDTO);
    }

    @GetMapping(path = "/{roomId}")
    public ResponseEntity<RoomDTO> getRoomById(@PathVariable Long roomId) {
        RoomDTO roomDTO = roomService.getRoomById(roomId);
        return ResponseEntity.ok(roomDTO);
    }

    @GetMapping
    public ResponseEntity<List<RoomDTO>> getAllRooms() {
        List<RoomDTO> roomDTOs = roomService.findAllRoom();
        return ResponseEntity.ok(roomDTOs);
    }

}
