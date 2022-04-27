package com.pagedirective;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class B extends org.apache.jasper.runtime.HttpJspBase{
	// class B in extending from the vendor implementing class to achieve multilevel inheritance
	public static int x = 10;

	@Override
	public void _jspService(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		
		
	}

}
