package com.xworkz.jpa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JspUtil {
	
	public EntityManager getfactory() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("factory:"+factory);
		
		return factory.createEntityManager();
	}

}
