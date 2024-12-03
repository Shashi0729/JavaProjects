package com.xworkz.jpa.repo;

import javax.persistence.EntityManager;

import com.xworkz.jpa.entity.UserEntity;
import com.xworkz.jpa.util.JspUtil;

public class JpaRepoImpl implements JpaRepo {

	JspUtil util = new JspUtil();

	@Override
	public void save(UserEntity entity) {
		EntityManager manager = util.getfactory();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();

	}

	@Override
	public UserEntity findById(String name) {
		EntityManager manager = util.getfactory();
		return manager.find(UserEntity.class, name);
	}

	@Override
	public void update(String name, UserEntity newentity) {
		UserEntity oldEntity = findById(name);
		System.out.println(" repo Update");
		EntityManager manager = util.getfactory();
		//oldEntity.setName(newentity.getName());
		oldEntity.setPhone(newentity.getPhone());
		
		manager.getTransaction().begin();
		manager.merge(oldEntity);
		manager.getTransaction().commit();
		manager.close();
		
		
		
	}

}
