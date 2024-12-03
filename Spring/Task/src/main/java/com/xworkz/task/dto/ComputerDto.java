package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;
@Data
@ToString

@Component
public class ComputerDto {
	@Value("Lenovo")
	private String companyName;
	@Value("Intel i5")
	private String processor;
	@Value("2 Gb")
	private String graphics;
	@Value("1000")
	private int storage;
	@Value("30000")
	private int price;
	@Value("16")
	private int size;
	

}
