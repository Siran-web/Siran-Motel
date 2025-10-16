package com.SiranMotel.Motel.controllers;

import com.SiranMotel.Motel.dtos.MenuDTO;
import com.SiranMotel.Motel.services.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/menu")

public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping
    public ResponseEntity<MenuDTO> createMenu(@RequestBody MenuDTO inputMenu) {
        MenuDTO menuDTO = menuService.createMenu(inputMenu);
        return ResponseEntity.ok().body(menuDTO);
    }

    @GetMapping(path = "/{menuId}")
    public ResponseEntity<MenuDTO> getMenuById(@RequestParam long menuId) {
        MenuDTO menuDTO = menuService.ShowMenuById(menuId);
        return ResponseEntity.ok().body(menuDTO);
    }

    @GetMapping
    public ResponseEntity<List<MenuDTO>> getAllMenu() {
        List<MenuDTO> menuDTOs = menuService.ShowAllMenus();
        return ResponseEntity.ok().body(menuDTOs);
    }

    @DeleteMapping(path = "/{menuId}")
    public ResponseEntity<Boolean> deleteMenuById(@PathVariable long menuId) {
        Boolean gotDeleted = menuService.deleteMenu(menuId);
        if (gotDeleted)
            return ResponseEntity.ok(true);
        return ResponseEntity.notFound().build();
    }

    @PutMapping(path = "/{menuId}")
    public ResponseEntity<MenuDTO> updateMenu(@PathVariable long menuId, @RequestBody MenuDTO inputMenu) {
        MenuDTO updateMenu = menuService.updateMenu(menuId , inputMenu);
        return ResponseEntity.ok(updateMenu);
    }
}
