package com.pms.service;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;

public class ProductService {

	ProductDao pd = new ProductDao();
	
	public String storeProduct(Product product) {
		if(product.getPrice()<=1000) {
			return "Product price must be > 1000";
		}else if(pd.storeProduct(product)>0) {
			return "Product stored succesfully";
		}else {
			return "Product didnt' store";
		}
	}
}