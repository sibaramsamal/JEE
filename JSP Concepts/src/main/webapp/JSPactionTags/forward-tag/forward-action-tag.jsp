<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>forward action tag</title>
</head>
<body>
	<h1 style="text-align: center;">This is Source page</h1>
	<jsp:forward page="destination.jsp">
		<jsp:param value="Parameter contents to be sent" name="xyz"/>
	</jsp:forward>
	
	<!-- forward tag is used to send request to another resource. Here we can also set parameter through
	jsp:param tag inside it and get it through request object -->
</body>
</html>