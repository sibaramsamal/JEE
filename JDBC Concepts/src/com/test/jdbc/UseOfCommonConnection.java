package com.test.jdbc;

import java.sql.Connection;

public class UseOfCommonConnection {
	public static void main(String[] args) {
		Connection con = ConnectionProvider.getConnection();
	System.out.println(con);
	}
}
