package com.xworkz.coffee.util;

import com.xworkz.coffee.constants.CoffeeFlavors;
import com.xworkz.coffee.dto.CoffeeDto;

public class Validation {

	public static boolean nameValidation(String name) {
		char[] ch = name.toCharArray();

		if (name != null && name.length() >= 3 && Character.isUpperCase(name.charAt(0))) {
			return true;
		}

		return false;

	}
	
	public static boolean CheckDuplicates(CoffeeDto[] listOfCoffee, CoffeeDto Dto) {
		System.out.println("Duplicate Check");
		for(CoffeeDto Playdto:listOfCoffee) {
			if(Playdto !=null && Playdto.equals(Dto)) {
				return true;
				
			}
			
			
		}
		return false;
	}
	
	public static boolean addressValidation(String name) {
		

		if (name != null && name.length() >= 3 && Character.isUpperCase(name.charAt(0))) {
			return true;
		}

		return false;

	}
	
	public static boolean staffValidation(int staff) {
		

		if (staff != 0 && staff >= 10) {
			return true;
		}

		return false;

	}
	
public static boolean contactValidation(long l) {
		String no=Long.toString(l);

		if (l != 0 && no.length() == 10) {
			return true;
		}

		return false;

	}
	
	

public static boolean flavorsValidation(String flavor) {
	

	if (flavor != null  ) {
		return true;
	}

	return false;


}
}
