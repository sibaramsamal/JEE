package com.test.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/welcome2")
public class MyGenericServlet extends GenericServlet{
/*
 	GenericServlet class implemented all the methods of Servlet interface except "service()"
 	User has to implement because, service() is unimplemented in this class. So GenericServlet is declared as abstract class for not implementing service()
 */
	@Override
	public void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException {
		var2.getWriter().print("Hello from Generic Servlet..");
	}
}
