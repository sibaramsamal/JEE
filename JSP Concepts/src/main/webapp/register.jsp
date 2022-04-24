<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration processing page</title>
</head>
<body>
	<jsp:useBean id="reg" class="com.jsp.beans.Credentials"></jsp:useBean>
	<jsp:setProperty property="*" name="reg"/>
	<jsp:useBean id="dao" class="com.jsp.DAO.Registration"></jsp:useBean>
	
	<%
		String result = dao.save(reg);
		if(result.equals("successful")){
	%>
	<jsp:forward page="welcome.jsp"></jsp:forward>
	<%
		}
		else
			out.print("Registration Failed !!!");
	%>
</body>
</html>