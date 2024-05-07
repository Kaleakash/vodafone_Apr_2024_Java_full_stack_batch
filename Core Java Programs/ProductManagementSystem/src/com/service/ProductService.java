package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Product;

public class ProductService {

	List<Product> listOfProduct = new ArrayList<Product>();
	// don't take value through keyboard from service class as well as service class not responsible 
	// display the output class. 
	
	public String addProduct(Product product) {
		listOfProduct.add(product);
		return "Product added successfully";
	}
	
	public List<Product> findAllProducts() {
		return listOfProduct;
	}
}
