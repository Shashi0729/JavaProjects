package com.xworkz.jpa.service;

import com.xworkz.jpa.entity.UserEntity;

public interface JpaService {
	
	public void save(UserEntity entity);
	public UserEntity findById(String name);
	public void update(String email,UserEntity entity);

}
