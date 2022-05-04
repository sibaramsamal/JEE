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
	<c:set var="num1" value="0">	</c:set>
	<!-- switch is not directly implemented, instead choose,when and otherwise is used. -->
	<c:choose>
		<c:when test="${ num1 < 0 }">
			<h1>Case 1 executed</h1>
			<h1>num1 < 0</h1>		
		</c:when>
		<c:when test="${ num1 > 0 }">
			<h1>Case 2 executed</h1>
			<h1>num1 > 0</h1>
		</c:when>
		<c:when test="${ num1 == 0 }">
			<h1>Case 3 executed</h1>
			<h1>num1 = 0</h1>
		</c:when>
		
		<c:otherwise>
			<h1>Default case executed...</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>