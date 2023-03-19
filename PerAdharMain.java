package com.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionImpl;


public class PerAdharMain 
{
public static void main(String[] args)
{
	
	
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Person person1=new Person();
	person1.setName("srikanth");
	person1.setAge(23);
	person1.setGender("male");
	person1.setPhno(9704036904l);
	
	Person person2=new Person();
	person2.setName("sumanth");
	person2.setAge(24);
	person2.setGender("male");
	person2.setPhno(7704036904l);
	
	AdharCard adharcard1=new AdharCard();
	adharcard1.setId(123);
	adharcard1.setAddress("chennai");
	
	AdharCard adharcard2=new AdharCard();
	adharcard2.setId(321);
	adharcard2.setAddress("banglore");
	
	person1.setCard(adharcard1);
	person2.setCard(adharcard2);
	
	entityTransaction.begin();
	entityManager.persist(person1);
	entityManager.persist(person2);
	entityManager.persist(adharcard1);
	entityManager.persist(adharcard2);
	entityTransaction.commit();
	


//	Person person=entityManager.find(Person.class,1);
//	System.out.println(person.getName());

	
}
}
