package com.xworkz.agency.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.agency.dto.AgencyDto;
import com.xworkz.agency.entity.AgencyEntity;

public class AgencyUtil {
	public static EntityManager getmanager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		return factory.createEntityManager();
	}

	public static AgencyDto mapEntitytoDto(AgencyEntity entity) {

		AgencyDto dto = new AgencyDto();
		
        dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setPassword(entity.getPassword());
		dto.setPhone(entity.getPhone());
		dto.setEmail(entity.getEmail());
		dto.setCompany_name(entity.getCompany_name());
		dto.setDescription(entity.getDescription());
		dto.setProduct_name(entity.getProduct_name());

		return dto;

	}

	public static AgencyEntity mapDtotoEntity(AgencyDto dto) {
		
		AgencyEntity entity = new AgencyEntity();
		
		entity.setName(dto.getName());
		entity.setPassword(dto.getPassword());
		entity.setPhone(dto.getPhone());
		entity.setEmail(dto.getEmail());
		entity.setCompany_name(dto.getCompany_name());
		entity.setDescription(dto.getDescription());
		entity.setProduct_name(dto.getProduct_name());

		return entity;

	}
}
