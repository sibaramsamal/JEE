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
		<h1>My Mail sending system</h1>
		<form action="MyMailServices" method="post">
			<input type="email" required name="from-address" placeholder="From"><br><br>
			<input type="email" required name="to-address" placeholder="To"><br><br>
			<textarea rows="2" cols="100" required name="subject" placeholder="Subject"></textarea><br><br>
			<textarea rows="5" cols="100" name="message-body"
				placeholder="Message Body"></textarea><br>
			<br>Attachments: <input type="file" name="attachment"><br><br>
			<input type="password" name="password" placeholder="password"><br><br> <input
				type="submit" value="send mail">
		</form>
	</center>
</body>
</html>