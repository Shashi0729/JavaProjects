package com.project.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.UserDetailsEntity;

@Component
public class ProjectRepoImpl implements ProjectRepo{
	@Autowired
	EntityManagerFactory factory;
	@Override
	public String onsave(UserDetailsEntity entity) {
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return "saved";
	}
}
