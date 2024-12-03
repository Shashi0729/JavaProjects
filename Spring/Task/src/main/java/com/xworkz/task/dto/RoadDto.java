package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class RoadDto {
	
	 @Value("National Highway")
	    private String roadType;
	    @Value("Asphalt")
	    private String material;
	    @Value("100")
	    private int length; 
	    @Value("5")
	    private int lanes;
	    @Value("Open")
	    private String condition;
	    @Value("India")
	    private String country;

}
