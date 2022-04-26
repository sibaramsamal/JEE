<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="../error-page.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="first-jsp.jsp" method="post">
		Name<input type="text" name="nm">
		Age<input type="text" name="age">
		Gender<input type="text" name="gen">
			<input type="submit" value="send">
	</form>
</body>
</html>