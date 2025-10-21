package com.SiranMotel.Motel.modelMappers;

import com.SiranMotel.Motel.dtos.VehicleDTO;
import com.SiranMotel.Motel.entities.VehicleEntity;

public class VehicleModelMapper {

    public static VehicleEntity toEntity(VehicleDTO dto) {
        VehicleEntity entity = new VehicleEntity();

        entity.setModel(dto.getModel());
        entity.setVehicleId(dto.getVehicleId());
        entity.setPricePerHour(dto.getPricePerHour());
        entity.setVehicleStatus(dto.getVehicleStatus());

        return entity;
    }

    public static VehicleDTO toDTO(VehicleEntity entity) {
        VehicleDTO dto = new VehicleDTO();
        dto.setModel(entity.getModel());
        dto.setVehicleId(entity.getVehicleId());
        dto.setPricePerHour(entity.getPricePerHour());
        dto.setVehicleStatus(entity.getVehicleStatus());
        return dto;
    }
}
