package com.xworkz.agency.service;

import java.util.List;

import com.xworkz.agency.dto.AgencyDto;
import com.xworkz.agency.entity.AgencyEntity;

public interface AgencyService {
	
	public String save(AgencyDto dto);
	
	public List<AgencyDto> read();

}
