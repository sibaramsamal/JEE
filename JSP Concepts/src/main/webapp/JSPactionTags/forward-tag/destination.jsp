<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>forward destination page</title>
</head>
<body>
	<h1>Forwarded request accepted here in this page... The set parameter values are: ${param.xyz}</h1>
	<!-- Here we displayed the param value through EL, but we can also get it by request.getParameter() -->
	<%=  %>
</body>
</html>