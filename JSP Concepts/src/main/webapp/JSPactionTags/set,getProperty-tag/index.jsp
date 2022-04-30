<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center">User registration form</h1>
		<form action="display-details.jsp" method="post">
			Name<input type="text" name="nm"><br> 
			Gender<input type="text" name="gen"><br> 
			Address<input type="text" name="addr"> 
				<input type="submit" value="Register">
		</form>
</body>
</html>