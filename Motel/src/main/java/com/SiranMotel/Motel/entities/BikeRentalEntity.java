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
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bike_id", nullable = false)
    private BikeEntity bike;
}
