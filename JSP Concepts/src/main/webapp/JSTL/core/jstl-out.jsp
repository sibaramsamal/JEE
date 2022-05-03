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
	<!-- JSTL out tag is alternate for the expression tag -->
	<c:out value="My name is Sibaram Samal"></c:out>
	<!-- We can also disply default valule or msg in out tag -->
	<c:set var="i" value="56"></c:set>
	<c:remove var="i"/><!-- Here the variable i is removed from servlet config -->
	<c:out value="${ i }">Defaault value of Variable i</c:out>
</body>
</html>