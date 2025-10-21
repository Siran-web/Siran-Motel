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

    private List<BookingCustomerDTO> bookings;
    private List<VehicleRentalDTO> bikeRentals;
    private List<FoodOrderDTO> foodOrders;
}
