<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<c:set var="num1" value="25"></c:set>
		<h1>
			<c:out value="${num1}"></c:out>
			<!-- If we access some value through variable, we have to use EL to resolve the value -->
		</h1>
</body>
</html>