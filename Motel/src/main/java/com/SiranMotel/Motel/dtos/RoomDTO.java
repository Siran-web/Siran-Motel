package com.SiranMotel.Motel.dtos;

import com.SiranMotel.Motel.type.RoomStatus;
import com.SiranMotel.Motel.type.RoomType;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoomDTO {
    private Long id;
    private String roomNumber;
    private RoomType roomType;
    private Integer price;
    private RoomStatus roomStatus;
}
