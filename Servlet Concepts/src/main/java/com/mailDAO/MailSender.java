package com.mailDAO;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailSender {
	public static void textMail(String from, String to, String sub, String body, String pass) {
		// declaring the host
		// Here we are assuming that we are sending mail through Gmail SMTP
		String host = "smtp.gmail.com";

		// getting the system properties
		Properties p = System.getProperties();

		// Properties p = new Properties();
		// setting up the mail server
		p.put("mail.smtp.host", host);
		p.put("mail.smtp.port", "465");
		p.put("mail.smtp.ssl.enable", "true");
		p.put("mail.smtp.auth", true);

		// getting session object
		Session ss = Session.getDefaultInstance(p, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, pass);
			}

		});

		// to enable debug facility
		ss.setDebug(true);

		// compose the message
		MimeMessage msg = new MimeMessage(ss);

		try {
			// set from: address
			msg.setFrom(from);

			// send To: adding to address
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Subject: adding subject to msg
			msg.setSubject(sub);

			// Body of the message: adding body to msg
			msg.setText(body);
			/*
			 * If we want to send HTML content, replace msg.setText(String x) with
			 * msg.setContent("<h1>This is HTML content</h1>","text/html");
			 */

			// send the msg using Transport class
			Transport.send(msg);

			System.out.print("Mail sent successfully...");
		} catch (MessagingException e) {
			System.out.print("Unable to send message !!!! ");
			e.printStackTrace();
		}
	}

	public static void attachmentMail(String from, String to, String sub, String body, String file, String pass) {
		String host = "smtp.gmail.com";

		Properties p = System.getProperties();

		p.put("mail.smtp.host", host);
		p.put("mail.smtp.port", "465");
		p.put("mail.smtp.ssl.enable", "true");
		p.put("mail.smtp.auth", true);

		Session ss = Session.getDefaultInstance(p, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, pass);
			}

		});

		ss.setDebug(true);

		MimeMessage msg = new MimeMessage(ss);

		try {
			msg.setFrom(from);

			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			msg.setSubject(sub);

			// Attachment code starts here
			Multipart m = new MimeMultipart();
			/*
			 * we have to declare two MimeBodypart type variables to hold attached file and
			 * text file separately
			 */
			MimeBodyPart atachments = new MimeBodyPart(); // for attachments
			MimeBodyPart texts = new MimeBodyPart();
			try {
				File f = new File(file); // file object is created using our selected file from the form
				
				//Bind values to the MimeBodyPart variables
				atachments.attachFile(f);
				texts.setText(body);
				
				//Add those variables to MultiPart variable
				m.addBodyPart(texts);
				m.addBodyPart(atachments);
				
				//Add the MultiPart object containing all the data of text and attachments
				msg.setContent(m);
				
				Transport.send(msg);
				System.out.print("Attachment Mail sent successfully....");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (MessagingException e) {
			System.out.print("Unable to send message !!!! ");
			e.printStackTrace();
		}
	}
}
