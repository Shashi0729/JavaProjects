package com.xworkz.lenovo.service;

import com.xworkz.lenovo.dto.LenovoDto;
import com.xworkz.lenovo.entity.LenovoEntity;
import com.xworkz.lenovo.repo.LenovoRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class LenovoServiceImpl implements LenovoService{
	private LenovoRepo repo;

	@Override
	public String save(LenovoDto dto) {
	LenovoEntity entity = new LenovoEntity();
//	dto.setName(entity.getName());
//	dto.setEmail(entity.getEmail());
	
	entity.setName(dto.getName());
	entity.setEmail(dto.getEmail());
	repo.save(entity);
	return "saved";
		
	}

}
