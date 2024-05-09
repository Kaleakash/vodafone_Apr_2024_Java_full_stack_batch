package com.pms.main;

import java.util.Scanner;

import com.pms.bean.Product;
import com.pms.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductService();
		System.out.println("Enter the pid");
		int pid = sc.nextInt();
		System.out.println("Enter the pname");
		String pname = sc.next();
		System.out.println("Enter the price");
		float price = sc.nextFloat();
		Product p = new Product(pid, pname, price);
		String result = ps.storeProduct(p);
		System.out.println(result);

	}

}
