package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.project.dto.UserDetailsDto;
import com.project.entity.UserDetailsEntity;
import com.project.repo.ProjectRepo;
import com.project.util.ProjectUtil;

@Component
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	ProjectRepo repo;
	
	@Override
	public boolean onsave(UserDetailsDto dto) {
		if(dto!=null) {
			UserDetailsEntity entity = ProjectUtil.convertDtoToEntity(dto);
			repo.onsave(entity);
			System.out.println("Saved");
		}
		return false;
	}

}
