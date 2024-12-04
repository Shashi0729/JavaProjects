package com.xworkz.laptop.config;

import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class Hp implements Laptop {

	public Hp() {
		System.out.println("HP");
	}
	

}
