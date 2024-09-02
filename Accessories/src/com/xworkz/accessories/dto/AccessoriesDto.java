package com.xworkz.accessories.dto;

import lombok.*;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AccessoriesDto {
	private String type;
    private String brand;
    private double price;
    private String color;
    private int quantity;
    private String material;


}
