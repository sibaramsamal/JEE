<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user registration form</title>
</head>
<body>
	<h1 style="text-align: center">User registration form</h1>
	<form action="register.jsp" method="post">
		Name<input type="text" name="nm"><br>
		Gender<input type="text" name="gen"><br>
		Address<input type="text" name="addr">
			<input type="submit" value="Register">
	</form>
</body>
</html>