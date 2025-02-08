package com.xworkz.game.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.xworkz.game.entity.GameEntity;
@Component

public class GameRepoImpl implements GameRepo {
	@Autowired
	 private EntityManagerFactory factory;
	@Bean
	@Override
	public boolean onSave(GameEntity entity) {
		System.out.println(entity);	
		EntityManager manager= factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return false;
			}
	}


