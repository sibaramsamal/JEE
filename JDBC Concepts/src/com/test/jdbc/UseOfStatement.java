package com.test.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

class DBtable{
		private static Connection con = null;
		private static Statement st = null;
		
	public static void createTable() {
		
		int r = 0;
		String QUERY = "create table Student_Details(sid int(3),sname char(25), gender char(5),address char(50))";
		
		con = ConnectionProvider.getConnection();
		try {
			st = con.createStatement();
			r = st.executeUpdate(QUERY);	//execute update will return the number of rows effected by the query
			System.out.println(r);
			st.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		if(r == 0)
			System.out.println("Table created");
		else
			System.out.println("Error creating table");
		}
	
	public static void insertData() {
		String QUERY = "insert into Student_details values(14,'Sibaram Samal','Male','At-Mainroad street, New Burupada,Ganjam,761146')";
		int r = 0;
		con = ConnectionProvider.getConnection();
		try {
			st = con.createStatement();
			r = st.executeUpdate(QUERY);
		} catch (SQLException e) {
			//System.out.println(e);
			e.printStackTrace();
		}
		if(r == 1)
			System.out.println("Data inserted successfully");
		else
			System.out.println("Error inserting data");
	}
	
	
}
public class UseOfStatement {

	public static void main(String[] args) {
		//DBtable.createTable();
		DBtable.insertData();
	}
}
