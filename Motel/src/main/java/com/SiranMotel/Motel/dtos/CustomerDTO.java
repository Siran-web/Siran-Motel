package com.SiranMotel.Motel.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
}
