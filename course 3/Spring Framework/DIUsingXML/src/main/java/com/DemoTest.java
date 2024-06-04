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
	}

}
