package com.sessiontrack.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		Cookie cobj[] = request.getCookies();
		for(int i=0; i<cobj.length ; i++) {
			/*if(cobj[i] != null)
				if(cobj[i].equals(name)) {
				//getting all the cookies
*/					response.getWriter().print(cobj[i].getName());
					response.getWriter().print(cobj[i].getValue());
				//}
		}
	}
}
