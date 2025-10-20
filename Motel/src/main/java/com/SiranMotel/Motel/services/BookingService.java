package com.SiranMotel.Motel.services;

import com.SiranMotel.Motel.dtos.BookingDTO;
import com.SiranMotel.Motel.entities.BookingEntity;
import com.SiranMotel.Motel.entities.CustomerEntity;
import com.SiranMotel.Motel.entities.RoomEntity;
import com.SiranMotel.Motel.modelMappers.BookingModelMapper;
import com.SiranMotel.Motel.repositories.BookingRepository;
import com.SiranMotel.Motel.repositories.CustomerRepository;
import com.SiranMotel.Motel.repositories.RoomRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;
    private final CustomerRepository customerRepository;
    private final RoomRepository roomRepository;

    @Transactional
    public BookingDTO addBooking(BookingDTO bookingDTO , Long roomId , Long customerId) {
        CustomerEntity customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + customerId));

        RoomEntity room = roomRepository.findById(roomId)
                .orElseThrow(() -> new RuntimeException("Room not found with ID: " + roomId));


        BookingEntity bookingEntity = BookingModelMapper.toBookingEntity(bookingDTO);

        bookingEntity.setCustomer(customer);
        bookingEntity.setRoom(room);

        BookingEntity savedBooking  = bookingRepository.save(bookingEntity);
        return BookingModelMapper.toBookingDTO(savedBooking);

    }

    @Transactional
    public List<BookingDTO> getAllBooking() {
        List<BookingEntity> bookingEntities = bookingRepository.findAll();
        List<BookingDTO> bookingDTOs = new ArrayList<>();
        for (BookingEntity bookingEntity : bookingEntities) {
            BookingDTO bookingDTO = BookingModelMapper.toBookingDTO(bookingEntity);
            bookingDTOs.add(bookingDTO);
        }
        return bookingDTOs;
    }

    @Transactional
    public BookingDTO getBookingById(Long id) {
        BookingEntity bookingEntity = bookingRepository.findById(id).orElse(null);
        BookingDTO bookingDTO = BookingModelMapper.toBookingDTO(bookingEntity);
        return bookingDTO;
    }

}
