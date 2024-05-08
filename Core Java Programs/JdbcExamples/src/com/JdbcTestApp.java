package com;
import java.sql.*;

public class JdbcTestApp {

	public static void main(String[] args) {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");		// mysql database 
	//Class.forName("oracle.jdbc.driver.OracleDriver");	// oracle database 
	System.out.println("Driver loaded succesfully");
Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/my_training_db", "root", "root@123");
System.out.println("Connected successfully");
		} catch (Exception e) {
			System.err.println(e.toString());
		}

	}

}
