package com.SiranMotel.Motel.modelMappers;

import com.SiranMotel.Motel.dtos.RoomDTO;
import com.SiranMotel.Motel.entities.RoomEntity;

public class RoomModelMapper {

    public static RoomEntity toEntity(RoomDTO dto){
       RoomEntity entity = new RoomEntity();

       entity.setRoomId(dto.getRoomId());
       entity.setRoomNumber(dto.getRoomNumber());
       entity.setPrice(dto.getPrice());
       entity.setRoomType(dto.getRoomType());
       entity.setRoomStatus(dto.getRoomStatus());

       return entity;
    }
    public static RoomDTO toDTO(RoomEntity entity) {
        RoomDTO dto = new RoomDTO();

        dto.setRoomId(entity.getRoomId());
        dto.setRoomNumber(entity.getRoomNumber());
        dto.setPrice(entity.getPrice());
        dto.setRoomType(entity.getRoomType());
        dto.setRoomStatus(entity.getRoomStatus());
        return dto;
    }
}
