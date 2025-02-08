package com.xworkz.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressDto {
	private int id;
	private int doorNo;
	private String area;
	private String city;
	private String state;
	private int pincode;

}
