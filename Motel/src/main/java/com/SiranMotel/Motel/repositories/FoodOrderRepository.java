package com.SiranMotel.Motel.repositories;

import com.SiranMotel.Motel.entities.FoodOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodOrderRepository  extends JpaRepository<FoodOrderEntity, Long> {
}
