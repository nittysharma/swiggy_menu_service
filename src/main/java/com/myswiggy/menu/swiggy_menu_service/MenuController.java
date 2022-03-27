package com.myswiggy.menu.swiggy_menu_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class MenuController {
    @Autowired
    MenuService menuService;

    @GetMapping("/getMenuByRestaurant/{id}")
    public List<MenuPojo> getMenuByRestaurant(@PathVariable("id") String id){
        return this.menuService.getMenuByRestaurant(id);
    }

    @PostMapping("/addMenuToRestaurant")
    public MenuPojo addMenuToRestaurant(@RequestBody MenuPojo menuPojo){
        return this.menuService.addMenuToRestaurant(menuPojo);
    }

}
