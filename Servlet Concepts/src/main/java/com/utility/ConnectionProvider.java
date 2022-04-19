package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee","root","");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}