package com.xworkz.userdetails.service;

import java.util.Arrays;

import com.xworkz.abstuserdetails.service.AbstUserInfoservice;
import com.xworkz.userdetails.dto.UserInfoDto;
import com.xworkz.userdetails.util.UserinfoValidation;

public class UserInfoService extends AbstUserInfoservice {
	public UserInfoDto[] listOfUserDto = new UserInfoDto[3];
	public int index = 0;

	@Override
	public void Onsave(UserInfoDto userDto) {
		System.out.println("Onsave is Running");
		UserinfoValidation.Checkaddress(userDto);
		if (userDto != null && userDto.getUserName().length() >= 3 && !userDto.getUserName().isBlank()
				&& !userDto.getUserName().isEmpty()) {

			if (this.index < listOfUserDto.length) {
				listOfUserDto[index] = userDto;
				index++;

				System.out.println("Saved Sucessfully");

			} else {
				System.out.println(" not Saved");
			}

		}

	}

	@Override
	public void deleteElement(String element) {
		int i, j;
		if (element != null) {
			for (i = 0, j = 0; i < this.listOfUserDto.length; i++) {
				if (!listOfUserDto[i].getEmail().equalsIgnoreCase(element)) {
					listOfUserDto[j++] = listOfUserDto[i];
				}
			}
			listOfUserDto = Arrays.copyOf(listOfUserDto, j);
		}
	}

	@Override
	public void readElement() {
		for (int i = 0; i < listOfUserDto.length; i++) {
			System.out.println(listOfUserDto[i]);
		}
	}

}
