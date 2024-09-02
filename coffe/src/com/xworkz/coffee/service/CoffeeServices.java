package com.xworkz.coffee.service;

import com.xworkz.coffee.dto.CoffeeDto;
import com.xworkz.coffee.util.Validation;

public class CoffeeServices extends AbstCoffeeServices {

	public CoffeeDto[] CoffDto = new CoffeeDto[3];
	public int index = 0;

	@Override
	public void Onsave(CoffeeDto dto) {

		if (dto != null) {
			boolean nameresult = Validation.nameValidation(dto.getCoffeeShopName());
			boolean duplicateresult= Validation.CheckDuplicates(CoffDto, dto);
			boolean addressResult= Validation.addressValidation(dto.getCoffeeShopAddress());
			boolean staffresult = Validation.staffValidation(dto.getNumberOfStaff());
			boolean noresult = Validation.contactValidation(dto.getCoffeeShopContactNo());

			if (nameresult == true && duplicateresult == false && addressResult ==true && staffresult==true && noresult==true) {

				if (this.index < CoffDto.length) {
					CoffDto[index] = dto;
					index++;
					System.out.println("saved");

				} else {
					System.out.println(" not saved");
				}
			}

		}
	}

	@Override
	public void Read() {
		for(CoffeeDto dto:CoffDto) {
			System.out.println(dto);
		}
		
	}
}
