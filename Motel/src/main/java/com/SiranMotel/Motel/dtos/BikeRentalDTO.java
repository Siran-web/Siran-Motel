package com.SiranMotel.Motel.dtos;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BikeRentalDTO {
    private Long bikeRentalId;
    private LocalDateTime rentalDate;
    private LocalDateTime returnDate;
    private Integer totalPrice;

    private CustomerDTO customerDTO;
    private BikeDTO bikeDTO;
}
