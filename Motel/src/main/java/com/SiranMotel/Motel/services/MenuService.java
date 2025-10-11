package com.SiranMotel.Motel.services;

import com.SiranMotel.Motel.dtos.MenuDTO;
import com.SiranMotel.Motel.entities.MenuEntity;
import com.SiranMotel.Motel.modelMappers.MenuModelMapper;
import com.SiranMotel.Motel.repositories.MenuRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MenuService {

    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository, MenuModelMapper modelMapper) {
        this.menuRepository = menuRepository;
    }

    public MenuDTO createMenu(MenuDTO menuDTO) {
        MenuEntity menuEntity = MenuModelMapper.toEntity(menuDTO);
        MenuEntity saveEntity = menuRepository.save(menuEntity);
        return MenuModelMapper.toDTO(saveEntity);
    }

    public List<MenuDTO> ShowAllMenus() {
        List<MenuEntity> menuEntities = menuRepository.findAll();
        List<MenuDTO> menuDTOs = new ArrayList<>();
        for (MenuEntity menuEntity : menuEntities) {
            menuDTOs.add(MenuModelMapper.toDTO(menuEntity));
        }
        return menuDTOs;
    }

    public MenuDTO ShowMenuById(Long id) {
        MenuEntity menuEntity = menuRepository.findById(id).orElse(null);
        assert menuEntity != null;
        return MenuModelMapper.toDTO(menuEntity);
    }
}
