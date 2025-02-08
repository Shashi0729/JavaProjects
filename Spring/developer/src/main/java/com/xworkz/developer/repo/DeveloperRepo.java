package com.xworkz.developer.repo;

import java.util.List;

import com.xworkz.developer.dto.DeveloperDto;
import com.xworkz.developer.entity.DeveloperEntity;


public interface DeveloperRepo {
	
	public boolean onSave(DeveloperEntity entity);
	List<DeveloperEntity> findAll();
	DeveloperEntity  findbyId(int id);
	boolean update (DeveloperEntity entity);
	public List<DeveloperEntity> getByDeveloperName(String developerName);
	boolean delete (DeveloperEntity entity);
}
