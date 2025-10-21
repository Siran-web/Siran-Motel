package com.SiranMotel.Motel.dtos;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VehicleRentalDTO {
    private Long vehicleRentalId;
    private LocalDateTime rentalDate;
    private LocalDateTime returnDate;
    private Integer totalPrice;

    private Long customerId;
    private Long vehicleId;
}
