package com.sessiontrack.urlrewrite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "UServlet2", urlPatterns = { "/UServlet2" })
public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("nm");
		String password = request.getParameter("pwd");
		
		PrintWriter out = response.getWriter();
		
		out.print("Name = "+name+" password = "+password);
	}
}
