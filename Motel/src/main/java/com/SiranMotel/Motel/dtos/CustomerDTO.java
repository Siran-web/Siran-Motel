package com.SiranMotel.Motel.dtos;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;

    private List<BookingDTO> bookings;
    private List<BikeRentalDTO> bikeRentals;
    private List<FoodOrderDTO> foodOrders;
}
