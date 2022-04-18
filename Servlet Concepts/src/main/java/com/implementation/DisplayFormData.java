package com.implementation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayFormData")
public class DisplayFormData extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String name = request.getParameter("nm");
		String gender = request.getParameter("gen");
		String age = request.getParameter("age");
		
		response.getWriter().print(
									"<html>"+
											"<body style='text-align:center'>"+
												"<h1>Displaying User data</h1>"+
												"<h4 style='display:inline'> Name: </h4>"+name+
												"<h4 style='display:inline'> Gender: </h4>"+gender+
												"<h4 style='display:inline'> Age: </h4>"+age+
											"</body>"+
									"</html>"	
									);
		//response.getWriter().println("Gender: "+gender);
		//response.getWriter().println("Age: "+age);
	 }
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
