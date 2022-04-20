package com.registerlogin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
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
		if(i > 0) {
			//response.getWriter().print("Data inserted successfully");	//Success msg displayed on browser screen
			//response.sendRedirect("user-login.html"); approach 1 of redirection
			RequestDispatcher rd = request.getRequestDispatcher("user-login.html");
			rd.forward(request, response);
		}
		else {
			//response.getWriter().print("Problem storing data !!!");
			response.sendRedirect("register-user-details.html");
		}
	}
}

/*
 	Redirection is done through 2 ways.
 		1. sendRedirect()
 		2. RequestDispatcher
 	In sendRedirect(), response is given by the redirected resource because a new fresh pair of ServletRequest and ServletResponse object are generated for each sendRedirect() operation. So url changes.
 	
 	But in case of RequestDispatcher, same pair of objects are sent to the requested resource. Here the output(response) is given by the same servlet not the requested resource. So url never changes.
 	
 	sendRedirect and forward is shown here in this program. include is shown in CheckValidUser servlet
 */


