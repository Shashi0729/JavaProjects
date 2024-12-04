package com.xworkz.os.dto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;
@ComponentScan("com.xworkz")
@Data
public class User {
	@Qualifier("windows")
	private Windows windows;

}
