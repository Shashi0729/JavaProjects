package com.project.util;

import org.springframework.beans.BeanUtils;

import com.project.dto.UserDetailsDto;
import com.project.entity.UserDetailsEntity;

public class ProjectUtil {
	private ProjectUtil() {
	}
	public static UserDetailsDto convertEntityToDto(UserDetailsEntity entity) {
		UserDetailsDto dto=new UserDetailsDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}
	
	public static UserDetailsEntity convertDtoToEntity(UserDetailsDto dto) {
		UserDetailsEntity entity=new UserDetailsEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}
}
