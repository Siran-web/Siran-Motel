package com.SiranMotel.Motel.modelMappers;

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

    public static BookingDTO toBookingDTO(BookingEntity entity){
        BookingDTO dto = new BookingDTO();
        dto.setBookingId(entity.getBookingId());
        dto.setCheckIn(entity.getCheckIn());
        dto.setCheckOut(entity.getCheckOut());
        dto.setTotalPrice(entity.getTotalPrice());
        return dto;
    }
}
