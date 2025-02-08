package com.xworkz.developer.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.developer.dto.DeveloperDto;
import com.xworkz.developer.entity.DeveloperEntity;

public interface DeveloperService {
	
 public Set<ConstraintViolation<DeveloperDto>> onSave(DeveloperDto dto);
 public List<DeveloperDto> findall();
 DeveloperDto  findbyId(int id);
	boolean update ( DeveloperDto dto);
	List<DeveloperDto> getByDeveloperName(String developerName);
	boolean delete ( DeveloperDto dto);
}
