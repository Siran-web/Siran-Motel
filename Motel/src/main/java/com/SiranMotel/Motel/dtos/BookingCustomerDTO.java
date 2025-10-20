package com.SiranMotel.Motel.dtos;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookingCustomerDTO {
    private Long bookingId;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Integer totalPrice;

    private Long roomId;
}
