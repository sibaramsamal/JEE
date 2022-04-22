package com.sessiontrack.hiddenfield;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HServlet1", urlPatterns = { "/HServlet1" })
public class Servlet1 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("nm");
		String pass = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		
		out.print(
				"<form action='HServlet2' method='post'>"+
					"<input type='hidden' name='nm2' value="+name+">"+
					"<input type='hidden' name='pass2' value="+pass+">"+
					"<input type='submit' value='Servlet2'>"+
				"</form>"
				);
	}

}
