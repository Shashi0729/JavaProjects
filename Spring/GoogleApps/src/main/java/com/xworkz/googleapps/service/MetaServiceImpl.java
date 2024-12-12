package com.xworkz.googleapps.service;

import org.springframework.stereotype.Component;

import com.xworkz.googleapps.dto.MetaDto;
@Component
public class MetaServiceImpl implements MetaService {

	@Override
	public String Onsave(MetaDto dto) {
		if(dto!=null) {
			System.out.println("Saved");
		}
		return null;
	}

}
