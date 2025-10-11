package com.SiranMotel.Motel.modelMappers;

import com.SiranMotel.Motel.dtos.MenuDTO;
import com.SiranMotel.Motel.entities.MenuEntity;

import java.util.Optional;

public class MenuModelMapper {

    public static MenuEntity toEntity(MenuDTO dto) {
        MenuEntity entity = new MenuEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setFoodType(dto.getFoodType());
        return entity;
    }

    public static MenuDTO toDTO(MenuEntity entity) {
        MenuDTO dto = new MenuDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        dto.setFoodType(entity.getFoodType());
        return dto;
    }
}
