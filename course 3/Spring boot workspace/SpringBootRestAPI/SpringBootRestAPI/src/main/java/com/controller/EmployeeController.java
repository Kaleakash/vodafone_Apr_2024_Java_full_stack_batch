package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController						// @Controller + @ResponseBody
public class EmployeeController {

	// http://localhost:9191/employee 
	
	@RequestMapping(value = "employee",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() {
		Employee emp1 = new Employee(100, "Steven", 34000);
		return emp1;
	}
	
	// http://localhost:9191/employees
	
	@RequestMapping(value = "employees",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployees() {
		Employee emp1 = new Employee(100, "Steven", 34000);
		Employee emp2 = new Employee(101, "Lex", 38000);
		Employee emp3 = new Employee(102, "John", 45000);
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		return listOfEmp;
	}
}
