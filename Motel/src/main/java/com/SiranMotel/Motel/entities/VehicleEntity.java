package com.SiranMotel.Motel.entities;

import com.SiranMotel.Motel.type.BikeStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vehicle")
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    private String model;

    @Column(nullable = false)
    private Integer pricePerHour;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BikeStatus vehicleStatus;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VehicleRentalEntity> vehicleRentals = new ArrayList<>();

}
