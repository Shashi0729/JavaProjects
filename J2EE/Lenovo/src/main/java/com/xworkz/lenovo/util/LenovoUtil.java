package com.xworkz.lenovo.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LenovoUtil {
	public static EntityManager getfactory() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		//System.out.println("factory:"+factory);
		
		return factory.createEntityManager();
}
}
