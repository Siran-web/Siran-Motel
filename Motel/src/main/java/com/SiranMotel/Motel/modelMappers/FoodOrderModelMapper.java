package com.SiranMotel.Motel.modelMappers;

import com.SiranMotel.Motel.dtos.FoodOrderDTO;
import com.SiranMotel.Motel.entities.FoodOrderEntity;

public class FoodOrderModelMapper {

    public static FoodOrderEntity toFoodOrderEntity(FoodOrderDTO dto) {
        FoodOrderEntity entity = new FoodOrderEntity();
        entity.setFoodOrderId(dto.getFoodOrderId());
        entity.setOrderDate(dto.getOrderDate());
        entity.setTotalPrice(dto.getTotalPrice());
        entity.setStatus(dto.getStatus());
        return  entity;
    }

    public static FoodOrderDTO toFoodOrderDTO(FoodOrderEntity entity) {
        FoodOrderDTO dto = new FoodOrderDTO();
        dto.setFoodOrderId(entity.getFoodOrderId());
        dto.setOrderDate(entity.getOrderDate());
        dto.setTotalPrice(entity.getTotalPrice());
        dto.setStatus(entity.getStatus());
        return  dto;
    }
}
