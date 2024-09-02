package com.xworkz.userdetails.util;

import com.xworkz.userdetails.dto.UserInfoDto;

public class UserinfoValidation {

	public static boolean Checkaddress(UserInfoDto userDto) {
		if(userDto !=null && userDto.getAddress().length()>=10 && !userDto.getAddress().isBlank() && !userDto.getAddress().isEmpty()) {
			return true;
		}else {
			System.out.println("Address is not valid....");
			
		}
		return false;
		
		
	}
}
