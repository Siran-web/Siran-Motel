package com.SiranMotel.Motel.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoomDTO {
    private Long id;
    private String number;
    private String type;
    private Integer price;
    private Boolean status;
}
