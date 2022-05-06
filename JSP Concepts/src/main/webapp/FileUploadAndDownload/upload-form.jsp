<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>File upload form</h1>
		<form action="file-upload.jsp" method="post" enctype="multipart/form-data">
			<input type="file" name="my-file">
				<input type="submit">
		</form>
	</center>
</body>
</html>