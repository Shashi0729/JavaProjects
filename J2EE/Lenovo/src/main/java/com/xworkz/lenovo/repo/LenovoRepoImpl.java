package com.xworkz.lenovo.repo;

import javax.persistence.EntityManager;


import com.xworkz.lenovo.entity.LenovoEntity;
import com.xworkz.lenovo.util.LenovoUtil;

public class LenovoRepoImpl implements LenovoRepo {
	

	@Override
	public void save(LenovoEntity entity) {
		EntityManager manager = LenovoUtil.getfactory();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		
	}

}
