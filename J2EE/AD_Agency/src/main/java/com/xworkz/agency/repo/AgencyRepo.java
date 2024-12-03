package com.xworkz.agency.repo;

import java.util.List;

import com.xworkz.agency.dto.AgencyDto;
import com.xworkz.agency.entity.AgencyEntity;


public interface AgencyRepo {
	
	public void save(AgencyEntity entity);
	
	public List<AgencyEntity> read();

}
