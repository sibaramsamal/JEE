<%@page import="com.pagedirective.B"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" extends="com.pagedirective.B"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Getting the value of x, inherited from class B -->
	<%=
		x
	%>
</body>
</html>

	<!-- 
					use of extends attribute
	
	when ever a jsp file deployed in the server, it internally converted into it's corresponding servlet,
having _jsp(underscore) in it's name. By default that class is extending from the vendor specific
implementation class of HttpJspPage interface. 
	So when we are mentioning extending from another class, it forms to multiple inheritance which is not
allowed in java. 
	To solve this, we have to make it multileveled inheritance. To do so, we have to make class B extend
from vendor implementing class.
	In this way we can use extend attribute of page directive
-->