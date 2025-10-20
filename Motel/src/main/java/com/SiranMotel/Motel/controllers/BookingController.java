package com.SiranMotel.Motel.controllers;

import com.SiranMotel.Motel.dtos.BookingDTO;
import com.SiranMotel.Motel.services.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = {"/booking"})
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping(path = "/id/{customerId}/room/{roomId}")
    public ResponseEntity<BookingDTO> createBooking(@RequestBody BookingDTO bookingDTO, @PathVariable Long customerId, @PathVariable Long roomId) {
        BookingDTO createBooking =   bookingService.addBooking(bookingDTO , roomId , customerId);
        return ResponseEntity.ok(createBooking);
    }

    @GetMapping
    public ResponseEntity<List<BookingDTO>> getAllBookings() {
        List<BookingDTO> getBookings = bookingService.getAllBooking();
        return ResponseEntity.ok(getBookings);
    }

    @GetMapping(path = "/{bookingId}")
    public ResponseEntity<BookingDTO> getBookingById(@PathVariable Long bookingId) {
        BookingDTO bookingDTO = bookingService.getBookingById(bookingId);
        return ResponseEntity.ok(bookingDTO);
    }
}
