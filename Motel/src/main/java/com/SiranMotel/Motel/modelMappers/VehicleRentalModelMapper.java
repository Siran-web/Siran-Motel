package com.SiranMotel.Motel.modelMappers;

import com.SiranMotel.Motel.dtos.VehicleRentalDTO;
import com.SiranMotel.Motel.entities.VehicleRentalEntity;

public class VehicleRentalModelMapper {
    public static VehicleRentalEntity toBikeRentalEntity(VehicleRentalDTO dto) {
        VehicleRentalEntity entity = new VehicleRentalEntity();
        entity.setVehicleRentalId(dto.getVehicleRentalId());
        entity.setRentalDate(dto.getRentalDate());
        entity.setReturnDate(dto.getReturnDate());
        entity.setTotalPrice(dto.getTotalPrice());
        return entity;
    }

    public static VehicleRentalDTO toBikeRentalDTO(VehicleRentalEntity entity) {
        VehicleRentalDTO dto = new VehicleRentalDTO();
        dto.setVehicleRentalId(entity.getVehicleRentalId());
        dto.setRentalDate(entity.getRentalDate());
        dto.setReturnDate(entity.getReturnDate());
        dto.setTotalPrice(entity.getTotalPrice());
        return dto;
    }
}
