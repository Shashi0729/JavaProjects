package com.xworkz.laptop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ComponentScan("com.xworkz")
@Data
public class User {
	@Autowired
	@Qualifier("lenovo")
	private Lenovo lenovo;

}
