package com.SiranMotel.Motel.controllers;

import com.SiranMotel.Motel.services.AvailabilityService;
import com.SiranMotel.Motel.type.RoomType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/availability")
public class AvailabilityController {

    private final AvailabilityService availabilityService;

    public AvailabilityController(AvailabilityService availabilityService) {
        this.availabilityService = availabilityService;
    }

    @GetMapping
    public ResponseEntity<Boolean> checkAvailability(
            @RequestParam RoomType roomType,
            @RequestParam LocalDate checkIn,
            @RequestParam LocalDate checkOut
    ) {
        System.out.println("RoomType: " + roomType);
        System.out.println("CheckIn: " + checkIn);
        System.out.println("CheckOut: " + checkOut);
        boolean isAvailable = availabilityService.isRoomTypeAvailable(
                roomType, checkIn, checkOut
        );
        return ResponseEntity.ok(isAvailable);
    }
}
