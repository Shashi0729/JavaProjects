package com.xworkz.agency.repo;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


import com.xworkz.agency.entity.AgencyEntity;
import com.xworkz.agency.util.AgencyUtil;


public class AgencyRepoImpl implements AgencyRepo {

	@Override
	public void save(AgencyEntity entity) {
		if(entity!=null) {
			EntityManager manager = AgencyUtil.getmanager();
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();
			manager.close();
			
		}
		
		
	}

	@Override
	public List<AgencyEntity> read() {
		EntityManager manager = AgencyUtil.getmanager();
		manager.getTransaction().begin();
	TypedQuery<AgencyEntity> query	=manager.createNamedQuery("read", AgencyEntity.class);
		return query.getResultList();
	}
	
	
	

}
