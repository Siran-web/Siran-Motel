package com.SiranMotel.Motel.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderItemDTO {
    private Long menuItemId;
    private Integer quantity;
    private Integer price;
}
