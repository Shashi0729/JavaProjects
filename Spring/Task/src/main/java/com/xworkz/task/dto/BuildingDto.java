package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class BuildingDto {
	  @Value("Residential")
	    private String buildingType;
	    @Value("Brick")
	    private String material;
	    @Value("5")
	    private int floors;
	    @Value("50")
	    private int rooms;
	    @Value("1000000")
	    private int price; // in currency
	    @Value("Urban")
	    private String location;
}
