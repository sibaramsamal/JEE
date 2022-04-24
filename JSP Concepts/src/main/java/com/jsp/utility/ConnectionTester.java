package com.jsp.utility;

import java.sql.Connection;

public class ConnectionTester {

	public static void main(String[] args) {
		Connection con = ConnectionProvider.getConnectio();
		System.out.println(con);
	}
}
