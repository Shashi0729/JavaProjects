package com.xworkz.abstuserdetails.service;

import com.xworkz.userdetails.dto.UserInfoDto;

public abstract class AbstUserInfoservice {
	
	public abstract void Onsave(UserInfoDto userDto);
	public abstract void readElement();
	public abstract void deleteElement(String element);

	

}
