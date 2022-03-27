package com.myswiggy.menu.swiggy_menu_service;

import java.util.List;
import java.util.UUID;

public interface MenuService {
    List<MenuPojo> getMenuByRestaurant(String id);

    MenuPojo addMenuToRestaurant(MenuPojo menuPojo);
}
