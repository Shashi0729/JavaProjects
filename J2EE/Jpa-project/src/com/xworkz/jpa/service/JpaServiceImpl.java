package com.xworkz.jpa.service;

import com.xworkz.jpa.entity.UserEntity;
import com.xworkz.jpa.repo.JpaRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor

public class JpaServiceImpl implements JpaService {
	
	private JpaRepo repo;

	@Override
	public void save(UserEntity entity) {
		if(entity!=null) {
		 repo.save(entity);
			System.out.println("Saved");

		}else {
			System.out.println("Not saved");
		}
		
		
	}

	@Override
	public UserEntity findById(String name) {
		
		return repo.findById(name);
	}

	@Override
	public void update(String email, UserEntity entity) {
		if(email != null|entity !=null){
			repo.update(email, entity);
			System.out.println(" service Update");
		}else {
			System.out.println("Not updated");
		}
		
	}

}
