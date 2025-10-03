package com.SiranMotel.Motel.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BikeDTO {
    private Long id;
    private String model;
    private Integer pricePerHour;
    private Boolean status;
}
