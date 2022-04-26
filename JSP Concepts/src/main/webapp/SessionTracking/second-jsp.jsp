<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true" errorPage="../error-page.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = (String)session.getAttribute("name");
		String age = (String)session.getAttribute("age");
		String gender = (String)session.getAttribute("gend");
		
		out.print("Welcome "+name+" age: "+age+" Gender: "+gender);
	%>
	<%= 10/0 %>
</body>
</html>