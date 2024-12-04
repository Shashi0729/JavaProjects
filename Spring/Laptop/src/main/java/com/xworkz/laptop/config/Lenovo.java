package com.xworkz.laptop.config;

import org.springframework.stereotype.Component;

@Component
public class Lenovo implements Laptop {
	
	public Lenovo() {
		System.out.println("Lenovo");
	}

}
