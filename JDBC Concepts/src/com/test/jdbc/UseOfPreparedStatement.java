package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class PreparedStatementDemo {
	public static void insertReccord(int sid, String sname, String gender, String address) {
		String QUERY = "insert into Student_details values(?,?,?,?)";
		int result = 0;
		Connection con = ConnectionProvider.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(QUERY);
			ps.setInt(1, sid);
			ps.setString(2, sname);
			ps.setString(3, gender);
			ps.setString(4, address);

			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (result == 0)
			System.out.println("failed to store Details");
		else
			System.out.println("Details stored successfully");
	}
}

public class UseOfPreparedStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======  Dynamic Record Insertion  ======");
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter Name: ");
		String name = sc.next();
		name += sc.next();
		System.out.println("Enter gender: ");
		String gender = sc.next();
		System.out.println("Enter address: ");
		String address = sc.next();
		sc.close();
		PreparedStatementDemo.insertReccord(id, name, gender, address);
	}
}