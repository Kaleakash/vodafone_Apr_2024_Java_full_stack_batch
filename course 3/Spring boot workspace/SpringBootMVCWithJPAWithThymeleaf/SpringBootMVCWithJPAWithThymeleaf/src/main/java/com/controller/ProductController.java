package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Product;
import com.service.ProductService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	// http://localhost:9191/
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openFirstPage() {
		
		// coding 
		System.out.println("I Came Here");
		return "index";		// view resolver responsible to check the page inside folder. 
		//return "welcome";
	}
	
	// http://localhost:9191/add
	
	@RequestMapping(value = "add",method = RequestMethod.GET)
	public String addProductPage() {
		// coding
		return "addProduct";			//open addProduct.html page 
	}
	
	@RequestMapping(value = "addProduct",method = RequestMethod.POST)
	public String addProductInDb(HttpServletRequest req, Product product) { //DI
		
		int id = Integer.parseInt(req.getParameter("id"));
		String pname= req.getParameter("pname");
		float price = Float.parseFloat(req.getParameter("price"));
		
		product.setId(id);
		product.setPname(pname);
		product.setPrice(price);
		
		String result = productService.storeProduct(product);
		
		System.out.println(result);
		
		return "addProduct";
	}
	
}




