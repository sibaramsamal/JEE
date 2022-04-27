<!-- Use of info attribute -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" info="This page will demostrate how info attribute is used in page directive"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>info attribute of page directive</title>
</head>
<body>
	<!-- Getting the info contents of this page -->
	<%=
		getServletInfo()	
	%>
</body>
</html>