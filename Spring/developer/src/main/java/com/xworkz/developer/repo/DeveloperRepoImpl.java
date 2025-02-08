package com.xworkz.developer.repo;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.xworkz.developer.entity.DeveloperEntity;

@Component
public class DeveloperRepoImpl implements DeveloperRepo {
	@Autowired
	EntityManagerFactory factory;

	@Bean
	@Override
	public boolean onSave(DeveloperEntity entity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}

	
	@Override
	public List<DeveloperEntity> findAll() {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		TypedQuery<DeveloperEntity> query = manager.createNamedQuery("find", DeveloperEntity.class);
		return query.getResultList();
	}


	@Override
	public DeveloperEntity findbyId(int id) {
		EntityManager manager = factory.createEntityManager();
		DeveloperEntity entity = manager.find(DeveloperEntity.class, id);
		return entity;
	}


	@Override
	public boolean update(DeveloperEntity entity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
	    manager.getTransaction().commit();
	    manager.close();
		return true;
	}

	@Override
	public List<DeveloperEntity> getByDeveloperName(String name) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("search");
		query.setParameter("dName", name);
		return query.getResultList();

}


	@Override
	public boolean delete(DeveloperEntity entity) {
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(entity);
		manager.getTransaction().commit();
		manager.close();
		return false;
	}
}
