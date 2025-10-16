package com.SiranMotel.Motel.services;

import com.SiranMotel.Motel.dtos.CustomerDTO;
import com.SiranMotel.Motel.dtos.MenuDTO;
import com.SiranMotel.Motel.entities.MenuEntity;
import com.SiranMotel.Motel.exception.ResourceNotFoundException;
import com.SiranMotel.Motel.modelMappers.MenuModelMapper;
import com.SiranMotel.Motel.repositories.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository, MenuModelMapper modelMapper) {
        this.menuRepository = menuRepository;
    }

    public MenuDTO createMenu(MenuDTO menuDTO) {
        MenuEntity menuEntity = MenuModelMapper.toEntity(menuDTO);
        menuEntity.setId(null);
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
        isExistMenu(id);
        MenuEntity menuEntity = menuRepository.findById(id).orElse(null);
        assert menuEntity != null;
        return MenuModelMapper.toDTO(menuEntity);
    }

    public void isExistMenu(Long menuId){
        boolean exist = menuRepository.existsById(menuId);
        if(!exist) throw new ResourceNotFoundException("Menu with id: " + menuId + " does not exist");
    }

    public Boolean deleteMenu(Long menuId){
        isExistMenu(menuId);
        menuRepository.deleteById(menuId);
        return true;
    }

    public MenuDTO updateMenu(Long menuId, MenuDTO menuDTO) {
        isExistMenu(menuId);
        MenuEntity menuEntity = MenuModelMapper.toEntity(menuDTO);
        menuEntity.setId(menuId);
        MenuEntity saveEntity = menuRepository.save(menuEntity);
        return MenuModelMapper.toDTO(saveEntity);
    }
}
