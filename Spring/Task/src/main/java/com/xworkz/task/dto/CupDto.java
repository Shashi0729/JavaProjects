package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class CupDto {
	 @Value("Ceramic")
	    private String material;
	    @Value("300ml")
	    private String capacity;
	    @Value("White")
	    private String color;
	    @Value("1")
	    private int quantity;
	    @Value("100")
	    private int price; // in currency
	    @Value("Dishwasher Safe")
	    private String feature;
}
