package com.jsp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.beans.Credentials;
import com.jsp.utility.ConnectionProvider;

public class Registration {
	public static String save(Credentials obj) {
		String query = "INSERT INTO user_credentials(uname, gender, address) VALUES (?,?,?)";
		Connection con = ConnectionProvider.getConnectio();
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, obj.getNm());
			pst.setString(2, obj.getGen());
			pst.setString(3, obj.getAddr());
			
			int i = pst.executeUpdate();
			
			if(i > 0)
				return "successful";
			else
				return "failed";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "failed";
	}
}
