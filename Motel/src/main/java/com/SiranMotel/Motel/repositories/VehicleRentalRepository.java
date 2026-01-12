package com.SiranMotel.Motel.repositories;

import com.SiranMotel.Motel.entities.VehicleRentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRentalRepository extends JpaRepository<VehicleRentalEntity, Long> {
}
