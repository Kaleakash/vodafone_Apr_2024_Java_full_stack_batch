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
	
	List<Product> listOfProduct = ps.findAllProduct();
	System.out.println("all products");
	for(Product p : listOfProduct) {
		System.out.println(p);
	}
	}

}
