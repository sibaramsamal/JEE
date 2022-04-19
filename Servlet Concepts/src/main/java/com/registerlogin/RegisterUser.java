package com.registerlogin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.ConnectionProvider;


@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("nm");
		String mail = request.getParameter("mail");
		String gender = request.getParameter("gen");
		String password = request.getParameter("pass");
		String[] language = request.getParameterValues("chk");
		String lang = "";
		
		for(String s:language)
			lang = lang+s;
		Connection con = ConnectionProvider.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("insert into user_details values(?,?,?,?,?)");
			pst.setString(1, uname);
			pst.setString(2, mail);
			pst.setString(3, gender);
			pst.setString(4, password);
			pst.setString(5, lang);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { doGet(request, response); }
	 */

}
