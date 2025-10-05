package com.SiranMotel.Motel.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false, length = 10)
    private String phone;

    // Relations
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BookingEntity> bookings;

    @OneToMany(mappedBy = "bikeRental" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BikeRentalEntity> bikeRentals;

    @OneToMany(mappedBy = "foodOrder" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FoodOrderEntity> foodOrders;
}
