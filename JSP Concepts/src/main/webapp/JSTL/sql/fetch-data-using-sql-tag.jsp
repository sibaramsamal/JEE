<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- setting up database connection credentials -->
	<!-- Here we have stored all these data in "ds" named variable -->
	<sql:setDataSource driver="com.mysql.jdbc.Driver" user="root" password="" url="jdbc:mysql://localhost:3306/j2ee" var="ds"/>
	
	<!-- setting up sql query -->
	<!-- we can fetch the results using "resultset" named variable -->
	<sql:query  dataSource="${ ds }" var="resultset">select * from user_credentials;</sql:query>
	
	<!-- displaying the fetched data -->
	<table>
		<thead>ID</thead><thead>Name</thead><thead>Gender</thead><thead>Address</thead>
		<c:forEach items="${ resultset.rows }" var="dta">
		<!-- "rows" is used to fetch single record at a time-->
			<tr>
				<td><c:out value="${ dta.uid }"></c:out></td>
				<td><c:out value="${ dta.uname }"></c:out></td>
				<td><c:out value="${ dta.gender }"></c:out></td>
				<td><c:out value="${ dta.address }"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>