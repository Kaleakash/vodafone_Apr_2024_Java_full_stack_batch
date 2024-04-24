package com.bean;

public class Employee {
private int id;
protected String name;
float salary;
public String designation;

	public void displayEmpInfo() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		System.out.println("designation is "+designation);
	}
}
