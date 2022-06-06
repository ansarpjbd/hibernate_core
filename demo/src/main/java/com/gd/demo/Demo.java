package com.gd.demo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo {
	
	public static void main(String[] args) {
		
		//HQL--hibernate query Lanaguage 
		
		
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)  //class which needs to map with database
				 //you need to pass the Entity
		        .buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		//select query using hibernate
		
		
		//Employee ravinder=new Employee(1, "kumar123", 200);
		
		session.beginTransaction();
		
		//session.save(ravinder);   //insrt query
		//session.delete(ravinder);  //delete 
		//session.saveOrUpdate(ravinder);  //update
		
		//here you need to pass the Entity Class name (not the table name)
		Query query =session.createQuery("from Employee");
		
		List<Employee> list=query.getResultList();
		
		for(Employee  e:list)
		{
		System.out.println(e);	
		}
		
		
		session.getTransaction().commit();
		
	}

}
