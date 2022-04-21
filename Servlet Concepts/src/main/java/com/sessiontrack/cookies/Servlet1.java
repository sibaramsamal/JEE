package com.sessiontrack.cookies;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String pass = request.getParameter("pass");
		response.setContentType("text/html");
		
		//cookie value created as key value pair
		Cookie cobj = new Cookie("nm",name);
		Cookie cobj2 = new Cookie("pas",pass);
		
		//cookie set with the response
		response.addCookie(cobj);
		response.addCookie(cobj2);
		
		response.getWriter().println("<br><a href='Servlet2'>Link to second Servlet</a>");
		//This line will request for Servlet2 component with a fresh pair of Servlet req. and resp. object in get mode. So there must be a doGet() or service() to receive the req and res. objects
	}
}
