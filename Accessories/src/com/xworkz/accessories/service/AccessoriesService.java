package com.xworkz.accessories.service;

import com.xworkz.abstaccessories.service.AbstAccessoriesService;
import com.xworkz.accessories.dto.AccessoriesDto;


public class AccessoriesService extends AbstAccessoriesService {
	public AccessoriesDto[] AccDto= new AccessoriesDto[3];
	public int index=0;
	@Override
	public void Onsave(AccessoriesDto dto) {
		if (dto == null) {
			System.out.println("dto is null, cant save");
			 
		} else {
			
				if (this.index < AccDto.length) {
					AccDto[index] = dto;
					index++;
					System.out.println("saved");
					

				}else {System.out.println(" not saved");}
			}
		
		
	}

	

}
