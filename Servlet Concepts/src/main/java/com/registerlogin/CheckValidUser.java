package com.registerlogin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.ConnectionProvider;

@WebServlet("/CheckValidUser")
public class CheckValidUser extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		res.setContentType("text/html");
		String name = req.getParameter("uname");
		String password = req.getParameter("pass");
		
		String QUERY = "select * from user_details where uname = ? and password = ?";
		Connection con = ConnectionProvider.getConnection();
		ResultSet rs = null;
		try {
			PreparedStatement ps = con.prepareStatement(QUERY);
			ps.setString(1, name);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				RequestDispatcher rd = req.getRequestDispatcher("welcome.html");
				rd.forward(req, res);
			}
			else {
				res.getWriter().print("Invalid User !!!");
				RequestDispatcher rd = req.getRequestDispatcher("user-login.html");
				rd.include(req, res);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
