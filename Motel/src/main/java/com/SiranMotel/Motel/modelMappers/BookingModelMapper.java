package com.SiranMotel.Motel.modelMappers;

import com.SiranMotel.Motel.dtos.BookingCustomerDTO;
import com.SiranMotel.Motel.dtos.BookingDTO;
import com.SiranMotel.Motel.entities.BookingEntity;

public class BookingModelMapper {
    public static BookingEntity toBookingEntity(BookingDTO dto){
        BookingEntity entity = new BookingEntity();
        entity.setBookingId(dto.getBookingId());
        entity.setCheckIn(dto.getCheckIn());
        entity.setCheckOut(dto.getCheckOut());
        entity.setTotalPrice(dto.getTotalPrice());
        return entity;
    }

    public static BookingDTO toBookingDTO(BookingEntity booking) {
        BookingDTO dto = new BookingDTO();
        dto.setBookingId(booking.getBookingId());
        dto.setCheckIn(booking.getCheckIn());
        dto.setCheckOut(booking.getCheckOut());
        dto.setTotalPrice(booking.getTotalPrice());

        if (booking.getCustomer() != null) {
            dto.setCustomerId(booking.getCustomer().getCustomerId());
        }
        if (booking.getRoom() != null) {
            dto.setRoomId(booking.getRoom().getRoomId());
        }

        return dto;
    }

    public static BookingCustomerDTO toBookingCustomerDTO(BookingEntity booking) {
        BookingCustomerDTO dto = new BookingCustomerDTO();

        dto.setBookingId(booking.getBookingId());
        dto.setCheckIn(booking.getCheckIn());
        dto.setCheckOut(booking.getCheckOut());
        dto.setTotalPrice(booking.getTotalPrice());

        if (booking.getRoom() != null) {
            dto.setRoomId(booking.getRoom().getRoomId());
        }

        return dto;
    }

}
