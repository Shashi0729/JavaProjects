package com.xworks.airport.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.xworks.airport.entity.AirportEntity;
@Component
public class AirportRepoImpl implements AirportRepo {
	@Autowired
	 private EntityManagerFactory factory;
		
	@Override
	@Bean
	public boolean onSave(AirportEntity entity) {
			System.out.println(entity);	
			EntityManager manager= factory.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();
			manager.close();
			System.out.println("saved");
		return true;
	}

}
