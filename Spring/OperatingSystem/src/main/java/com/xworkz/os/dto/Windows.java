package com.xworkz.os.dto;

import org.springframework.stereotype.Component;

@Component

public class Windows implements OperatingSystem{

	public Windows() {
		System.out.println("Windows");
	}

}
