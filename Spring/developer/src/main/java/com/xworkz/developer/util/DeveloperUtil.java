package com.xworkz.developer.util;

import java.util.Set;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;

import com.xworkz.developer.dto.DeveloperDto;
import com.xworkz.developer.entity.DeveloperEntity;


public class DeveloperUtil {
	
	private DeveloperUtil() {
		
	}
	
	public static Set<ConstraintViolation<DeveloperDto>> validation(DeveloperDto dto) {
		
	ValidatorFactory factory =	Validation.buildDefaultValidatorFactory();
	Validator validator =factory.getValidator();
	return validator.validate(dto);
	}

	public static DeveloperDto convertToDto(DeveloperEntity entity) {
		DeveloperDto dto = new DeveloperDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
}
}
