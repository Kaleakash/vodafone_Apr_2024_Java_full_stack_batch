package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository			// this dao layer specific annotation 
public class ProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int storeProduct(Product product) {
		try {
	return jdbcTemplate.update("insert into product values(?,?,?)", product.getPid(),product.getPname(),product.getPrice());
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
//	@Autowired
//	DataSource ds;		// before spring framework we were searching database connection using jndi lookup 
//						// in spring this information present in beans.xml file with less configuration 
//	
////	private final DataSource ds;
////	
////	public ProductDao(DataSource ds) {
////		// TODO Auto-generated constructor stub
////		this.ds=ds;
////	}
//	public int storeProduct(Product product) {
//		try {
//			Connection con = ds.getConnection();
//			PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
//			pstmt.setInt(1, product.getPid());
//			pstmt.setString(2, product.getPname());
//			pstmt.setFloat(3, product.getPrice());
//			return pstmt.executeUpdate();
//		} catch (Exception e) {
//			System.err.println(e);
//			return 0;
//		}
//	}
//	
//	public List<Product> findAllProducts() {
//		List<Product> listOfProduct = new ArrayList<Product>();
//		try {
//			Connection con = ds.getConnection();
//			PreparedStatement pstmt = con.prepareStatement("select * from product");
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				Product product = new Product();
//				product.setPid(rs.getInt(1));
//				product.setPname(rs.getString(2));
//				product.setPrice(rs.getFloat(3));
//				listOfProduct.add(product);
//			}
//		} catch (Exception e) {
//			System.err.println(e);
//		}
//		return listOfProduct;
//	}
}
