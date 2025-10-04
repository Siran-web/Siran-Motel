package com.SiranMotel.Motel.dtos;

import com.SiranMotel.Motel.type.FoodType;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MenuDTO {
    private Long id;
    private String name;
    private Integer price;
    private FoodType foodType;

}
