package com.xworkz.project.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.project.entity.IndustryEntity;

@Component
public class IndustryRepoImpl implements IndustryRepo {
	@Autowired
	EntityManagerFactory factory;

	@Override
	public String onSave(IndustryEntity entity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return "Saved";
	}

	@Override
	public IndustryEntity getemail(String email) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<IndustryEntity> entity = manager.createNamedQuery("IndustryfindByEmail", IndustryEntity.class);
		entity.setParameter("email", email);
		
		try {
			if (entity.getSingleResult() != null) {
				return entity.getSingleResult();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public IndustryEntity getid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IndustryEntity getemailInActive(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getgst(Long gst) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getcontact(Long contactNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IndustryEntity update(IndustryEntity entity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
		return entity;
	}

}
