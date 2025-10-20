package com.SiranMotel.Motel.repositories;

import com.SiranMotel.Motel.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    @Query("Select c from CustomerEntity c where c.name = :name")
    CustomerEntity findByNameCaseInsensitive( String name);
}
