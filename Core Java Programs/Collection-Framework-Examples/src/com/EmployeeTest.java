package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
	List<Employee> listOfEmployees = new ArrayList<Employee>();
	System.out.println("number of employees records are "+listOfEmployees.size());
	
	Employee emp1 = new Employee();
	emp1.setId(100);
	emp1.setName("Steven");
	emp1.setSalary(34000);

	Employee emp2 = new Employee(101, "lex", 38000);
	
	listOfEmployees.add(emp1);
	listOfEmployees.add(emp2);
	listOfEmployees.add(new Employee(102, "Neena", 4000));
	
	System.out.println("number of employees records are "+listOfEmployees.size());
	System.out.println("Retrieve all records one by one ");
	listOfEmployees.remove(1);	// remove using index position 
	Iterator<Employee> li1 = listOfEmployees.iterator();
	while(li1.hasNext()) {
		Employee e = li1.next();
		if(e.getId()==102) {		// remove using id of employee 
			//System.out.println("yes");
			li1.remove();
		}
	}
	for(Employee e:listOfEmployees) {
		System.out.println(e);
	}
	
	}

}
