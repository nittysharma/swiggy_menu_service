package com.myswiggy.menu.swiggy_menu_service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class MenuServiceImpl implements MenuService{
@Autowired
MenuRepo menuRepo;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public List<MenuPojo> getMenuByRestaurant(String id) {
        return menuRepo.findByRestaurantId(id).stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public MenuPojo addMenuToRestaurant(MenuPojo menuPojo) {
        return convertToDto(this.menuRepo.save(convertToEntity(menuPojo)));
    }

    MenuPojo convertToDto(Menu menu){
        MenuPojo menuPojo=modelMapper.map(menu, MenuPojo.class);
        return menuPojo;
    }

    Menu convertToEntity(MenuPojo menuPojo){
        Menu menu=modelMapper.map(menuPojo, Menu.class);
        return menu;
    }
}
