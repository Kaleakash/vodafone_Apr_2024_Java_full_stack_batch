package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Product;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	
	ProductService ps = (ProductService)ac.getBean("productService");	

	Product p1 = (Product)ac.getBean("product");
	
	p1.setPid(106);
	p1.setPname("Hard Disk");
	p1.setPrice(25000);

	String result1 = ps.storeProduct(p1);
	System.out.println(result1);

	}

}
