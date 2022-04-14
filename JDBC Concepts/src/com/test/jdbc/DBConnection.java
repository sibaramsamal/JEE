package com.test.jdbc;

public interface DBConnection {
	//specific for mySql db s/w
	String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	String URL = "jdbc:mysql://localhost:3306/j2ee";
	String USER = "root";
	String PASSWORD = "";
}
