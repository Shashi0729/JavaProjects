package com.xworkz.agency.service;

import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.agency.dto.AgencyDto;

import com.xworkz.agency.entity.AgencyEntity;
import com.xworkz.agency.repo.AgencyRepo;
import com.xworkz.agency.repo.AgencyRepoImpl;
import com.xworkz.agency.util.AgencyUtil;

import lombok.Data;

@Data

public class AgencyServiceImpl implements AgencyService {
	 AgencyRepo repo = new AgencyRepoImpl();

	@Override
	public String save(AgencyDto dto) {
		// AgencyEntity entity =new AgencyEntity();

		if (dto != null) {
			AgencyEntity entity = AgencyUtil.mapDtotoEntity(dto);
			repo.save(entity);

		}
		return "saved";

	}

	public AgencyServiceImpl(AgencyRepo repo) {

	}

	@Override
	public List<AgencyDto> read() {
		List<AgencyEntity> entities = repo.read();
		return entities.stream().map(AgencyUtil::mapEntitytoDto).collect(Collectors.toList());
	}

}
