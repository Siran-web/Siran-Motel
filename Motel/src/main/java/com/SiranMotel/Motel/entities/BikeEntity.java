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
@Table(name = "bike")
public class BikeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bikeId;

    private String model;

    @Column(nullable = false)
    private Integer pricePerHour;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BikeStatus bikeStatus;

    @OneToMany(mappedBy = "bike", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BikeRentalEntity> bikeRentals = new ArrayList<>();

}
