package com.xworkz.developer.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class DeveloperDto {
	private int id;
	@NotBlank
	private String name;
	private int contact;
	private String email;
	private String role;
	private int pay;
}
