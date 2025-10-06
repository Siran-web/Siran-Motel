package com.SiranMotel.Motel.dtos;

import com.SiranMotel.Motel.type.Status;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FoodOrderDTO {
    private Long foodOrderId;
    private LocalDateTime orderDate;
    private Integer totalPrice;
    private Status status;

    private CustomerDTO customerDTO;
    private List<OrderItemDTO>   orderItemDTOList;
}
