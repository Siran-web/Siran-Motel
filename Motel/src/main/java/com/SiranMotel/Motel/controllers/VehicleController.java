package com.SiranMotel.Motel.controllers;

import com.SiranMotel.Motel.dtos.VehicleDTO;
import com.SiranMotel.Motel.services.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping
    public ResponseEntity<VehicleDTO> createVehicle(@RequestBody VehicleDTO vehicleDTO) {
        VehicleDTO vehicle = vehicleService.createVehicle(vehicleDTO);
        return ResponseEntity.ok().body(vehicle);
    }

    @GetMapping
    public ResponseEntity<List<VehicleDTO>> getAllVehicles() {
        List<VehicleDTO> vehicles = vehicleService.getAllVehicles();
        return ResponseEntity.ok().body(vehicles);
    }

    @GetMapping(path = "/{vehicleId}")
    public ResponseEntity<VehicleDTO> getVehicleById(@PathVariable Long vehicleId) {
        VehicleDTO vehicle = vehicleService.getVehicleById(vehicleId);
        return ResponseEntity.ok().body(vehicle);
    }
}
