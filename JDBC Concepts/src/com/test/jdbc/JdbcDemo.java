package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 	Aim: To test Database connectivity with JDBC API 
	Database s/w: MySql
	Driver: mysql-connector-java-8.0.28.jar
	
	Steps to connect with database:
	1. Load the driver class
	2. Establish the connection
	3. Create statement
	4. Send and execute query
	5. Process the result
	6. close the resources
	
 */

public class JdbcDemo {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee","root","");
		System.out.println(con);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from emp");
		while(rs.next()) {
			System.out.println("Emp ID: "+rs.getInt("eid"));
			System.out.println("Emp Name: "+rs.getString("ename"));
		}
		st.close();
		rs.close();
		con.close();
		}catch(ClassNotFoundException e) {
			System.out.println("Driver class not found");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
