package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class  ConnectionProvider{
	private ConnectionProvider(){
		
	}
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName(DBConnection.DRIVER_CLASS);//load the driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee","root","");
		}catch(ClassNotFoundException e) {
			System.out.println("Driver class not found");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
