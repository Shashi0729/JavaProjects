package com.xworkz.shashi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class ShashiConfiguration {

	public ShashiConfiguration() {
		System.out.println("Configuration class");
	}
	
	

}
