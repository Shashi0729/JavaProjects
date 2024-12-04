package com.xworkz.laptop.config;

import org.springframework.stereotype.Component;

@Component

public class Samsung implements Laptop {
	
	public Samsung() {
		System.out.println("Samsung");
	}

}
