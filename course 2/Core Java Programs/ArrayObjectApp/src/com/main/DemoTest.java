package com.main;

import java.util.Scanner;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
//		Employee emp1 = new Employee();
//		emp1.setId(100);
//		emp1.setName("Ravi");
//		emp1.setSalary(14000);
//		
//		Employee emp2 = new Employee(101, "Steven", 24000);
//		
//		System.out.println("id is "+emp1.getId());
//		System.out.println("name is "+emp1.getName());
//		System.out.println("salary is "+emp1.getSalary());
//		
//		System.out.println("id is "+emp2.getId());
//		System.out.println("name is "+emp2.getName());
//		System.out.println("salary is "+emp2.getSalary());
//		
//		System.out.println(emp1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("how many employee details do you want to store?");
		int size = sc.nextInt();
		Employee empoyees[]=new Employee[size];			// array object created 
		
		System.out.println("Plz enter employee record one by one");
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+(i+1)+" employee details");
				empoyees[i]=new Employee();	// memory created using index position 
			System.out.println("Enter the id");
			int id = sc.nextInt();
			empoyees[i].setId(id);
			System.out.println("Enter the name");
			String name = sc.next();
			empoyees[i].setName(name);
			System.out.println("Enter the salary");
			float salary = sc.nextFloat();
			empoyees[i].setSalary(salary);
		}
		// business logic 
		System.out.println("All Employee details are ");
		for(Employee emp:empoyees) {
			//System.out.println(emp);   // it call toString method 
			System.out.println("id is "+emp.getId()+" Name is "+emp.getName());
		}
	}

}






