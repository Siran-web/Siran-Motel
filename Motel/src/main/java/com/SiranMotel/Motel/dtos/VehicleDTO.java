package com.SiranMotel.Motel.dtos;

import com.SiranMotel.Motel.type.BikeStatus;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VehicleDTO {
    private Long vehicleId;
    private String model;
    private Integer pricePerHour;
    private BikeStatus vehicleStatus;
}
