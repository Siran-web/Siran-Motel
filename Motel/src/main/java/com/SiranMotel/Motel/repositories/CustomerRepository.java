package com.SiranMotel.Motel.repositories;

import com.SiranMotel.Motel.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
