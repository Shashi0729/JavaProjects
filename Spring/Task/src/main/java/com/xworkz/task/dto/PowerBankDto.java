package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class PowerBankDto {
	 @Value("Mi")
	    private String brand;
	    @Value("20000mAh")
	    private String capacity;
	    @Value("2")
	    private int ports;
	    @Value("Lithium-ion")
	    private String batteryType;
	    @Value("1500")
	    private int price; 
	    @Value("Portable")
	    private String feature;
}
