package com;
import java.sql.*;
import java.util.Scanner;

public class JdbcTestApp {

	public static void main(String[] args) {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");		// mysql database 
	//Class.forName("oracle.jdbc.driver.OracleDriver");	// oracle database 
	System.out.println("Driver loaded succesfully");
Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/my_training_db", "root", "root@123");
//Connection con = 
//DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

System.out.println("Connected successfully");
//Statement stmt = con.createStatement();

//	// insert Query 
//	int result = stmt.executeUpdate("insert into product values(103,'Pen Drive',2500)");
//	if(result>0) {
//		System.out.println("Record inserted successfully");
//	}

//	//delete Query 
//	int result = stmt.executeUpdate("delete from product where pid=103");
//	if(result>0) {
//		System.out.println("Record deleted successfully");
//	}else {
//		System.out.println("Record not present");
//	}


	//update Query 
//	int result = stmt.executeUpdate("update product set price=60000 where pid=100");
//	if(result>0) {
//	System.out.println("Record updated successfully");
//	}else {
//	System.out.println("Record not present");
//	}
	
	// retreive query 
//	ResultSet rs = stmt.executeQuery("select * from product");
//	while(rs.next()) {
//	System.out.println("pid is "+rs.getInt(1)+" PName is "+rs.getString(2)+" Price "+rs.getFloat(3));
//	}
//	stmt.close();
	
	Scanner sc = new Scanner(System.in);

//	// insert query using PreparedStatement 
//	PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
//	System.out.println("Enter the product id");
//	int pid = sc.nextInt();
//		pstmt.setInt(1, pid);
//	System.out.println("Enter the product name");
//	String pname = sc.next();
//		pstmt.setString(2, pname);
//	System.out.println("Enter the price");
//	float price = sc.nextFloat();
//		pstmt.setFloat(3, price);
//	int result = pstmt.executeUpdate();
//	if(result>0) {
//		System.out.println("Record inserted successfully");
//	}
	
//	// delete query using PreparedStatement 
//		PreparedStatement pstmt = con.prepareStatement("delete from product where pid = ?");
//		System.out.println("Enter the product id");
//		int pid = sc.nextInt();
//			pstmt.setInt(1, pid);
//		
//		int result = pstmt.executeUpdate();
//		if(result>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
	
	// update query using PreparedStatement 
		PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid =?");
		System.out.println("Enter the product id");
		int pid = sc.nextInt();
			pstmt.setInt(2, pid);
		System.out.println("Enter the price");
		float price = sc.nextFloat();
			pstmt.setFloat(1, price);
		int result = pstmt.executeUpdate();
		if(result>0) {
			System.out.println("Record updated successfully");
		}else {
			System.out.println("Record not present");
		}
	pstmt.close();
	con.close();
		} catch (Exception e) {
			System.err.println(e.toString());
		}

	}

}
