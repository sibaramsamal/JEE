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
	<c:if test="${ 560 > 60 }">
		Yes 560 is greater than 60
		<!-- we can place any code inside if tag -->
	</c:if>
	<!-- Condition is placed inside test attribute. We can also place variabbles through EL also -->
</body>
</html>