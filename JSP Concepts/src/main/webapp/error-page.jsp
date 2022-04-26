<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Default error page</title>
</head>
<body>
	<h1 style="text-align: center; font-family: monospace;">Something
		went wrong!!!</h1>
	<%
	if (exception instanceof ArithmeticException) {	//exception type checked and accordingly msg displayed
	%>
	<h2 style="text-align: center">Can't devide a number by zero</h2>
	<%
	}
	%>
</body>
</html>