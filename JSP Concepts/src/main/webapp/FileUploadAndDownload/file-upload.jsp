<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		MultipartRequest m = new MultipartRequest(request, "F:/[ By Nataraja Sir ] Advanced Java/eclipse-workspace[ JEE ]/Projects/JEE Concepts/JSP Concepts/src/UploadedFiles");
		out.print("successfully uploaded");
	%>
</body>
</html>