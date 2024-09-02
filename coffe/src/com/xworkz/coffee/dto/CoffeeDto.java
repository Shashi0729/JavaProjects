package com.xworkz.coffee.dto;

import java.time.LocalDate;


import com.xworkz.coffee.constants.CoffeeFlavors;
import lombok.*;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class CoffeeDto {
	
	private String coffeeShopName;
	private String coffeeShopAddress;
	private int numberOfStaff;
	private long coffeeShopContactNo;
	private CoffeeFlavors flavors;
	private LocalDate shopStartedDate;
	

}
