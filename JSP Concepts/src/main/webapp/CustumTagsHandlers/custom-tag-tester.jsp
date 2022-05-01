<%@ taglib uri="/WEB-INF/myHandlers.tld" prefix="sibaram" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String number1 = request.getParameter("n1");
		String number2 = request.getParameter("n2");
	%>

	<sibaram:sum num1="<%= number1 %>" num2="<%= number2 %>"></sibaram:sum>
</body>
</html>