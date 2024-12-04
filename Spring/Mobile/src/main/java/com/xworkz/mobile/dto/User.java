package com.xworkz.mobile.dto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;

import lombok.Data;

@ComponentScan("com.xworkz")
@Data
public class User {
	
	@Qualifier("samsung")
	
	private Samsung samsung;

}
