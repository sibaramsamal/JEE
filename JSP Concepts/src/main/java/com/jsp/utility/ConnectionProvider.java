package com.jsp.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	private static Connection con = null; 
	public static Connection getConnectio() {
		String URl = "jdbc:mysql://localhost:3306/j2ee";
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String userName = "root";
		String password = "";
		try {
			Class.forName(driverClass);
			con = DriverManager.getConnection(URl,userName,password);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
		return con;
	}
}
