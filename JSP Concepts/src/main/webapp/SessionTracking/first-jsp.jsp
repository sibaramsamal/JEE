<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("nm");
		String age = request.getParameter("age");
		String gender = request.getParameter("gen");
		session.setAttribute("name", name);
		session.setAttribute("age", age);
		session.setAttribute("gen", gender);
	%>
	<a href="second-jsp.jsp">Second JSP</a>
</body>
</html>