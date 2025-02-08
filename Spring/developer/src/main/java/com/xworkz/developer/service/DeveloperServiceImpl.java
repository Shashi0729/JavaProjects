package com.xworkz.developer.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.developer.dto.DeveloperDto;
import com.xworkz.developer.entity.DeveloperEntity;
import com.xworkz.developer.repo.DeveloperRepo;
import com.xworkz.developer.util.DeveloperUtil;

@Component
public class DeveloperServiceImpl implements DeveloperService {
	@Autowired
	private DeveloperRepo repo;

//   public void setRepo(DeveloperRepo repo) {
//       this.repo = repo;
//   }
	@Override
	public Set<ConstraintViolation<DeveloperDto>> onSave(@Valid DeveloperDto dto) {
		DeveloperEntity entity = new DeveloperEntity();
		if (dto != null) {
			Set<ConstraintViolation<DeveloperDto>> voilation = DeveloperUtil.validation(dto);
			if (voilation.isEmpty()) {
				BeanUtils.copyProperties(dto, entity);
				if (repo.onSave(entity)) {
					return Collections.emptySet();
				}

			}
			return voilation;
		}
		return Collections.emptySet();
	}

	@Override
	public List<DeveloperDto> findall() {
		List<DeveloperEntity> list = repo.findAll();
		return list.stream().map(this::convertToDto).collect(Collectors.toList());
	}

	public DeveloperDto convertToDto(DeveloperEntity entity) {
		DeveloperDto dto = new DeveloperDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

	public DeveloperEntity convertToEntity(DeveloperDto dto) {
		DeveloperEntity entity = new DeveloperEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	@Override
	public DeveloperDto findbyId(int id) {
		if (id > 0) {
			DeveloperEntity entity = repo.findbyId(id);
			return convertToDto(entity);
		}
		return null;
	}

	@Override
	public boolean update(DeveloperDto dto) {
		if (dto != null) {
			if (repo.update(convertToEntity(dto))) {
				return true;

			}
		}
		return false;
	}

	@Override
	public List<DeveloperDto> getByDeveloperName(String name) {
		if (name != null) {

			// search method from the repo
			List<DeveloperEntity> listOfEntities = repo.getByDeveloperName(name);
			if (listOfEntities != null) {
				return listOfEntities.stream().map(this::convertToDto).collect(Collectors.toList());
			}
		}
		return Collections.emptyList();

		
	}

	@Override
	public boolean delete(DeveloperDto dto) {
		if (dto != null) {
			if (repo.update(convertToEntity(dto))) {
				return true;

			}
		}		return false;
	}

}
