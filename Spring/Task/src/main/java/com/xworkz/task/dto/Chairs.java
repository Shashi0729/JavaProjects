package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class Chairs {
    @Value("Wooden")
    private String material;
    @Value("Red")
    private String color;
    @Value("4")
    private int legs;
    @Value("50")
    private int price; // in currency
    @Value("Ergonomic")
    private String type;
    @Value("Yes")
    private String hasCushion; // whether the chair has cushion
}
