package com.sessiontrack.hiddenfield;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HServlet2", urlPatterns = { "/HServlet2" })
public class Servlet2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("nm2");
		String pass = request.getParameter("pass2");
		
		PrintWriter out = response.getWriter();
		out.print("name = "+name+" Password = "+pass);
	}
}
