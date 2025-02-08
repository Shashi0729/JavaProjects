package com.xworkz.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BrandDto {
	private int id;
	private String brandName;
	private AddressDto address;
	private int price;
}
