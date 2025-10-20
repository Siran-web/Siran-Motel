package com.SiranMotel.Motel.modelMappers;

import com.SiranMotel.Motel.dtos.CustomerDTO;
import com.SiranMotel.Motel.entities.CustomerEntity;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerModelMapper {

    public static CustomerEntity toEntity(CustomerDTO dto) {
    CustomerEntity entity = new CustomerEntity();
    entity.setCustomerId(dto.getCustomerId());
    entity.setName(dto.getName());
    entity.setEmail(dto.getEmail());
    entity.setPhone(dto.getPhone());
    entity.setAddress(dto.getAddress());

    return entity;
}

    public static CustomerDTO toDTO(CustomerEntity entity) {
        CustomerDTO dto = new CustomerDTO();
        dto.setCustomerId(entity.getCustomerId());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setPhone(entity.getPhone());
        dto.setAddress(entity.getAddress());


        if (entity.getBookings() != null) {
            dto.setBookings(
                    entity.getBookings().stream()
                            .map(BookingModelMapper::toBookingCustomerDTO)
                            .collect(Collectors.toList())
            );
        }


        return dto;
    }
}
