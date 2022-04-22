package com.sessiontrack.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SServlet1", urlPatterns = { "/SServlet1" })
public class Servlet1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("nm");
		String password = request.getParameter("pass");
		
		//Session creation
		HttpSession ss = request.getSession();
		ss.setAttribute("nm", name);
		ss.setAttribute("pw", password);
		
		PrintWriter out = response.getWriter();
		//To check new user or not
		if(ss.isNew())
			out.print("1st login");
		else
			out.print("Old user");
		out.print(
				"<br><a href='SServlet2'>Servlet2</a>"
				);
	}
}
