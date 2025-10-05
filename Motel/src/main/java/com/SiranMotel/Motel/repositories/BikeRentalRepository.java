package com.SiranMotel.Motel.repositories;

import com.SiranMotel.Motel.entities.BikeRentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRentalRepository extends JpaRepository<BikeRentalEntity, Long> {
}
