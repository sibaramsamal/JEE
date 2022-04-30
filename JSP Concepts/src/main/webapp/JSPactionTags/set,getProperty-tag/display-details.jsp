<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- object of java bean is created in next line of name "userObj" --%>
	<jsp:useBean id="userObj" class="com.jsp.beans.Credentials"></jsp:useBean>
	
	<jsp:setProperty  property="*" name="userObj" />
	<!-- Here in the above line properties are set to the object of java bean.
		* represents all the properties of bean where the name is same as per the name in the html form 
		we can also specify the separate properties in the property attribute.
	-->
	<jsp:setProperty property="nm" name="userObj" value="Sibaram"/>
	<!-- or -->
	<%
		String name = "Sibaram";
	%>
	<jsp:setProperty property="nm" name="userObj" value="<%= name %>"/>
	
	<jsp:getProperty property="nm" name="userObj"/>
	<jsp:getProperty property="gen" name="userObj"/>
	<jsp:getProperty property="addr" name="userObj"/>
	
</body>
</html>