package com.xworkz.jpa.runner;

import com.xworkz.jpa.entity.UserEntity;
import com.xworkz.jpa.repo.JpaRepo;
import com.xworkz.jpa.repo.JpaRepoImpl;
import com.xworkz.jpa.service.JpaService;
import com.xworkz.jpa.service.JpaServiceImpl;

public class JpaRunner {
	public static void main(String[] args) {

		//UserEntity entity = new UserEntity();
		//UserEntity entity1 = new UserEntity();
		UserEntity entity2 = new UserEntity();
		//entity.setName("nithin");
     //   entity1.setName("Taseer");
       // entity2.setName("mallikarjun");
        entity2.setPhone("1236");
		JpaRepo repo = new JpaRepoImpl();
		JpaService ser = new JpaServiceImpl(repo);
		//ser.save(entity2);
	
		
		
	System.out.println(ser.findById("mallikarjun"));	
	
	ser.update("shashi", entity2);

	}
}
