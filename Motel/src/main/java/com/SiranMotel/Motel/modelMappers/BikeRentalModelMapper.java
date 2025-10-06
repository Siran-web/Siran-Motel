package com.SiranMotel.Motel.modelMappers;

import com.SiranMotel.Motel.dtos.BikeRentalDTO;
import com.SiranMotel.Motel.entities.BikeRentalEntity;

public class BikeRentalModelMapper {
    public static BikeRentalEntity toBikeRentalEntity(BikeRentalDTO dto) {
        BikeRentalEntity entity = new BikeRentalEntity();
        entity.setBikeRentalId(dto.getBikeRentalId());
        entity.setRentalDate(dto.getRentalDate());
        entity.setReturnDate(dto.getReturnDate());
        entity.setTotalPrice(dto.getTotalPrice());
        return entity;
    }

    public static BikeRentalDTO toBikeRentalDTO(BikeRentalEntity entity) {
        BikeRentalDTO dto = new BikeRentalDTO();
        dto.setBikeRentalId(entity.getBikeRentalId());
        dto.setRentalDate(entity.getRentalDate());
        dto.setReturnDate(entity.getReturnDate());
        dto.setTotalPrice(entity.getTotalPrice());
        return dto;
    }
}
