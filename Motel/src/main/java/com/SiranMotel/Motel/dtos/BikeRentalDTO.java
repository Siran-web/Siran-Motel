package com.SiranMotel.Motel.dtos;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BikeRentalDTO {
    private Long id;
    private LocalDateTime rentalDate;
    private LocalDateTime returnDate;
    private Integer totalPrice;

    private Long customerId;
    private Long bikeId;
}
