package com.xworkz.userdetails.runner;

import com.xworkz.abstuserdetails.service.AbstUserInfoservice;
import com.xworkz.userdetails.constants.GenderConstant;
import com.xworkz.userdetails.dto.UserInfoDto;
import com.xworkz.userdetails.service.UserInfoService;

public class UserInfoRunner {

	public static void main(String[] args) {
		UserInfoDto userDto= new UserInfoDto("raam","H no 75 Btm 2nd Stallplpge",1234567890L,121245457878L,(short)24,"Raam@gmail.com","B.E",GenderConstant.MALE,"Manager");
		UserInfoDto userDto2= new UserInfoDto("raaj","H no 75 Btm 2nd Stallplpge",1234567890L,121245457878L,(short)24,"Raaj@gmail.com","B.E",GenderConstant.MALE,"Manager");
		UserInfoDto userDto3= new UserInfoDto("raajesh","H no 75 Btm 2nd Stallplpge",1234567890L,121245457878L,(short)24,"Raajesh@gmail.com","B.E",GenderConstant.MALE,"Manager");

		
		AbstUserInfoservice userinfo = new UserInfoService();
		userinfo.Onsave(userDto);
		userinfo.Onsave(userDto2);
		userinfo.Onsave(userDto3);
		userinfo.readElement();
		System.out.println("--------------------------");
		userinfo.deleteElement("Raam@gmail.com");
		userinfo.readElement();
		
		
		

	}

}
