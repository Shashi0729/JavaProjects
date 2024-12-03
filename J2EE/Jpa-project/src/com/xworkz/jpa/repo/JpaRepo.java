package com.xworkz.jpa.repo;

import com.xworkz.jpa.entity.UserEntity;

public interface JpaRepo {

	public void save(UserEntity entity);
	public UserEntity findById(String name);
	public void update(String email,UserEntity entity);
}
