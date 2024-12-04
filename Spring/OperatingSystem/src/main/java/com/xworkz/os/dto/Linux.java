package com.xworkz.os.dto;
import org.springframework.stereotype.Component;

@Component

public class Linux implements OperatingSystem{

	public Linux() {
		System.out.println("Linux");
	}

}
