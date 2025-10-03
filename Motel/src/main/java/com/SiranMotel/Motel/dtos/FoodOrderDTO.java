package com.SiranMotel.Motel.dtos;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FoodOrderDTO {
    private Long id;
    private LocalDateTime orderDate;
    private Integer totalPrice;
    private Boolean status; // Enum: PLACED, COOKING, DELIVERED

    private Long customerId;
    private List<OrderItemDTO> items;
}
