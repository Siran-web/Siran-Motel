package com.SiranMotel.Motel.dtos;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerDTO {
    private Long customerId;
    private String name;
    private String email;
    private String phone;
    private String address;

    private List<BookingDTO> bookings;
    private List<BikeRentalDTO> bikeRentals;
    private List<FoodOrderDTO> foodOrders;
}
