package com.xworkz.accessories.runner;

import com.xworkz.accessories.constants.TypeConstants;
import com.xworkz.accessories.dto.AccessoriesDto;
import com.xworkz.accessories.service.AccessoriesService;

public class AccessoriesRunner {

	public static void main(String[] args) {
	AccessoriesDto ADto= new AccessoriesDto();
	AccessoriesDto ADto1= new AccessoriesDto();
	AccessoriesDto ADto2= new AccessoriesDto();
	AccessoriesDto ADto3= new AccessoriesDto();
	ADto.setType(TypeConstants.Mobiles.toString());
	ADto1.setType(TypeConstants.Computers.toString());
	ADto2.setType(TypeConstants.Computers.toString());
	ADto3.setType(TypeConstants.Watches.toString());
	AccessoriesService ASer= new AccessoriesService();
	ASer.Onsave(ADto);
	ASer.Onsave(ADto1);
	ASer.Onsave(ADto2);
	ASer.Onsave(ADto3);
	System.out.println(ADto);
	System.out.println(ADto1);
	System.out.println(ADto2);
	
	}

}
