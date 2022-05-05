<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- JSTL functions tag is used only to String handling purpose -->
	<c:set var="name" value="My name is Sibaram Samal"></c:set>
	<h1>
		Length of the given string,name is:<c:out value="${ fn:length(name) }"></c:out><br>
		Inputed string in lower case is: <c:out value="${ fn:toUpperCase(name) }"></c:out>
	</h1>
	
</body>
</html>