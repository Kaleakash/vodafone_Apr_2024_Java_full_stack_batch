package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
	// peristence unit name present in persisten.xml file which 
		// hold entity class as well as database details. 
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Crud_Operation");
	System.out.println("loaded persistence unit name");
	// Entity Manager factory is like Connection in JDBC. 
	EntityManager manager = emf.createEntityManager(); // it is like a Statement or PreparedStatement. 
	EntityTransaction tran = manager.getTransaction();		// get transaction object. 
	// insert record 
	Employee emp1 = new Employee();
	emp1.setId(100);
	emp1.setName("Ravi");
	emp1.setSalary(34000);
	
	tran.begin();
		manager.persist(emp1);   // save the record ie insert query 
	tran.commit();
	System.out.println("Record inserted...");
	}

}
