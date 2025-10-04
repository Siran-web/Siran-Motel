package com.SiranMotel.Motel.dtos;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookingDTO {
    private Long id;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Integer totalPrice;

    private CustomerDTO customerDTO;
    private RoomDTO roomDTO;
}
