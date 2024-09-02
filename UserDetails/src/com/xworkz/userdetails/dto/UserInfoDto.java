package com.xworkz.userdetails.dto;

import com.xworkz.userdetails.constants.GenderConstant;


import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class UserInfoDto {
	private String userName;
	private String address;
	private long contactNo;
	private long adharNo;
	private short age;
	private String email;
	private String education;
	private GenderConstant gender;
	private String desgnation;

}
