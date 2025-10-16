package com.SiranMotel.Motel.controllers;

import com.SiranMotel.Motel.dtos.RoomDTO;
import com.SiranMotel.Motel.services.RoomService;
import org.apache.catalina.connector.Response;
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

    @DeleteMapping(path = "/{roomId}")
    public ResponseEntity<Boolean> deleteRoomById(@PathVariable Long roomId) {
        boolean gotDelete = roomService.deleteRoomById(roomId);
        if(gotDelete)
            return ResponseEntity.ok(true);
        return ResponseEntity.notFound().build();
    }

    @PutMapping(path = "/{roomId}")
    public ResponseEntity<RoomDTO> updateRoomById(@PathVariable Long roomId, @RequestBody RoomDTO input) {
        RoomDTO roomDTO = roomService.updateRoom(roomId, input);
        return ResponseEntity.ok(roomDTO);
    }

}
