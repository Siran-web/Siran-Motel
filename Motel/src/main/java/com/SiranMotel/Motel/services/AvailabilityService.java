package com.SiranMotel.Motel.services;

import com.SiranMotel.Motel.repositories.BookingRepository;
import com.SiranMotel.Motel.type.RoomType;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AvailabilityService {

    private final BookingRepository bookingRepository;

    public AvailabilityService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public boolean isRoomTypeAvailable(
            RoomType roomType,
            LocalDate checkIn,
            LocalDate checkOut
    ) {
        return !bookingRepository.existsOverlappingBooking(
                roomType, checkIn, checkOut
        );
    }
}
