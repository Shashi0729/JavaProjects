package com.xworkz.os.dto;
import org.springframework.stereotype.Component;

@Component
public class Mac implements OperatingSystem {

	public Mac() {
		System.out.println("Mac");
	}

}
