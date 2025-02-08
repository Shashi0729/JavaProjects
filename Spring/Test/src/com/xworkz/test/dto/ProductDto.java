package com.xworkz.test.dto;

import com.xworkz.test.constants.ProductType;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class ProductDto {
	private int id;
	private String productName;
	private BrandDto brand;
	private ProductType type;
	private int quantity;

}
