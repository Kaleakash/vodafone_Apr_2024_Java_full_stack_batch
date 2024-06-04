package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.display();
		
		Resource res  = new ClassPathResource("beans.xml"); // load the xml file 
		BeanFactory obj = new XmlBeanFactory(res);   // get beanfactory interface reference. 
		
		Employee employee1 = (Employee)obj.getBean("emp1"); // pull the object from container 
		employee1.display();
		
		Employee employee2 = (Employee)obj.getBean("emp1"); // pull the object from container 
		employee2.display();
		
		Employee employee3 = (Employee)obj.getBean("emp2"); // pull the object from container 
		employee3.display();
		
		Employee employee4 = (Employee)obj.getBean("emp2"); // pull the object from container 
		employee4.display();
		
	}

}
