package com.myswiggy.menu.swiggy_menu_service;

import com.sun.istack.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class MenuPojo {
    private UUID id;
    @NotNull
    private String restaurantId;
    @NotNull
    private String dishName;
    private String dishDesc;
    @NotNull
    private double price;
    @NotNull
    private double quantity;
    private String startTime;
    private String endTime;
    private String days;
    private String imageUrl;
}
