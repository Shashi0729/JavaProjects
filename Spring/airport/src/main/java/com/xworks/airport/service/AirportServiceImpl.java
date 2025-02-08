package com.xworks.airport.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworks.airport.dto.AirPortDto;
import com.xworks.airport.entity.AirportEntity;
import com.xworks.airport.repo.AirportRepo;
import com.xworks.airport.repo.AirportRepoImpl;
@Component
public class AirportServiceImpl implements AirportService{
	@Autowired
	private AirportRepoImpl repo;

	@Override
	public String onSave(AirPortDto dto) {
		AirportEntity entity =new AirportEntity();
		if(dto!=null) {
			BeanUtils.copyProperties(dto, entity);
			repo.onSave(entity);
		}
		return "Service";
	}

}
