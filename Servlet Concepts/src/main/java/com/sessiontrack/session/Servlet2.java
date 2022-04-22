package com.sessiontrack.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SServlet2", urlPatterns = { "/SServlet2" })
public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ss = request.getSession();
		String name = (String)ss.getAttribute("nm");
		String password = (String)ss.getAttribute("pw");
		
		PrintWriter out = response.getWriter();
		
		out.print("Name "+name+" Password "+password);
	}

}
