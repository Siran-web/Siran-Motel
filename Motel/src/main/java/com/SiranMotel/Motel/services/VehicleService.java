package com.SiranMotel.Motel.services;

import com.SiranMotel.Motel.dtos.VehicleDTO;
import com.SiranMotel.Motel.entities.VehicleEntity;
import com.SiranMotel.Motel.exception.ResourceNotFoundException;
import com.SiranMotel.Motel.modelMappers.VehicleModelMapper;
import com.SiranMotel.Motel.repositories.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public VehicleDTO createVehicle(VehicleDTO vehicleDTO) {
        VehicleEntity vehicleEntity = VehicleModelMapper.toEntity(vehicleDTO);
        VehicleEntity savedVehicle = vehicleRepository.save(vehicleEntity);
        return VehicleModelMapper.toDTO(savedVehicle);
    }

    public List<VehicleDTO> getAllVehicles() {
        List<VehicleEntity> vehicleEntities = vehicleRepository.findAll();
        List<VehicleDTO> vehicleDTOs = new ArrayList<>();
        for (VehicleEntity vehicleEntity : vehicleEntities) {
            vehicleDTOs.add(VehicleModelMapper.toDTO(vehicleEntity));
        }
        return vehicleDTOs;
    }

    public void isExist(Long vehicleId){
        boolean exists = vehicleRepository.existsById(vehicleId);
        if(!exists) throw new ResourceNotFoundException("Vehicle Not Found with id: " + vehicleId);
    }

    public VehicleDTO getVehicleById(Long vehicleId) {
        isExist(vehicleId);
        VehicleEntity vehicleEntity = vehicleRepository.findById(vehicleId).orElse(null);
        assert vehicleEntity != null;
        return VehicleModelMapper.toDTO(vehicleEntity);
    }

}
