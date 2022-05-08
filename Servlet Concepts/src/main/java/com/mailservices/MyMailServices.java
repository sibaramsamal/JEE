package com.mailservices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mailDAO.MailSender;


@WebServlet("/MyMailServices")
public class MyMailServices extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recepient's details that are needed for sending mail
		String fromAddress = request.getParameter("from-address");
		String toAddress = request.getParameter("to-address");
		String subject = request.getParameter("subject");
		String msgBody = request.getParameter("message-body");
		
		File file = new File(request.getParameter("attachment"));
		
		String attachment = file.getAbsolutePath();
		
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		out.print("From: "+fromAddress+"\nTo: "+toAddress+"\nSubject: "+subject+
				"\nBody: "+msgBody+"\nAttachment: "+attachment+"\nPassword: "+password);
		
		if(!(attachment == null))
			MailSender.attachmentMail(fromAddress,toAddress,subject,msgBody,attachment,password);
		else
			MailSender.textMail(fromAddress,toAddress,subject,msgBody,password);
	}
}
