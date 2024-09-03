package com.xworkz.coffee.runner;

import java.time.LocalDate;

import com.xworkz.coffee.constants.CoffeeFlavors;
import com.xworkz.coffee.dto.CoffeeDto;
import com.xworkz.coffee.service.CoffeeServices;

public class CoffeeRunner {

	public static void main(String[] args) {
		CoffeeDto Coffee1 = new CoffeeDto("Rajesh Cafe", "Btm", 20, 3265758975l, CoffeeFlavors.Caffèmocha,LocalDate.now());

		CoffeeServices CoffSer = new CoffeeServices();
		CoffSer.Onsave(Coffee1);
		CoffSer.Read();
	}

}
