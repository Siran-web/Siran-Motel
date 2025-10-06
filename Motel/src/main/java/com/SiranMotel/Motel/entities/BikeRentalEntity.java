package com.SiranMotel.Motel.entities;

import com.SiranMotel.Motel.dtos.BikeDTO;
import com.SiranMotel.Motel.dtos.CustomerDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bikeRental")
public class BikeRentalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bikeRentalId;

    private LocalDateTime rentalDate;
    private LocalDateTime returnDate;

    @Column(nullable = false)
    private Integer totalPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerEntity customerEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    private BikeEntity bikeEntity;
}
