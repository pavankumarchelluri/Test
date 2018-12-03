package com.login;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class LoginImpl {

	public static void main(String[] args) {
		
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
		EntityManager entityManager = emf.createEntityManager();

		entityManager.getTransaction().begin();
		
		Login login= new Login();
		login.setUserName("pavan");
		login.setPassword("pavan");

		entityManager.persist(login);
		entityManager.getTransaction().commit();
		
		login.setUserName("santosh");
		entityManager.persist(login);
		
		Login login1=(Login)entityManager.find(Login.class, 4);
		System.out.println("name is"+login1.getUserName());
		System.out.println("password is"+login1.getPassword());
		
	}

}
