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
			lang = lang+s+",";
		
		
		PreparedStatement pst = null;
		int i = 0;
		try {
			Connection con = ConnectionProvider.getConnection();
			pst = con.prepareStatement("insert into user_details(uname,mail,gender,password,languages) values(?,?,?,?,?)");
			pst.setString(1, uname);
			pst.setString(2, mail);
			pst.setString(3, gender);
			pst.setString(4, password);
			pst.setString(5, lang);
			
			i = pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		if(i > 0)
			response.getWriter().print("Data inserted successfully");
		else
			response.getWriter().print("Problem storing data !!!");
	}
}
