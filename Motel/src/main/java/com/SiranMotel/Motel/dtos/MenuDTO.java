package com.SiranMotel.Motel.dtos;

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
}
