package com.xworkz.bankdetails.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.xworkz.bankdetails.entity.BankEntity;
@Component
public class BankRepoImpl implements BankRepo {
	@Autowired
	 private EntityManagerFactory factory;
	@Bean
	@Override
	public boolean onSave(BankEntity entity) {
		System.out.println(entity);	
		EntityManager manager= factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return false;
	}

}
