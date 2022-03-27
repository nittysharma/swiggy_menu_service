package com.myswiggy.menu.swiggy_menu_service;

import com.sun.istack.NotNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;
import java.util.UUID;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
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
