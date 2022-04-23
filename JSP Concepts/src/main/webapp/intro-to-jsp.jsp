<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<%--	This is comment tag
	Other tags in JSP are-
	1. <% %> - This is scriptlet tag and inside it we can place all the business logic
		 All the codes inside this tag are internally placed inside the service() of generated servlet, so we can't place any method inside this tag.
	2. 	<%= %> - this is Expression tag.
		We can say, this tag is used as the replacement of out.println()
	3.<%! %> - This is declaration tag and the variable or methods declared inside this tag are public throughout the program
		
	--%>
	
	<%-- Practical of above points --%>
	<%-- 
	
	1. Declaring a global variable and a local variable with same name num1(let) and display them.
	2. Develop a business logic for finding square of a number and display it
	
	 --%>
	<%!
	// We can't place method inside scriptlet tag. So we have used declaration tag for this purpose
		int num1 = 56;	// this variable is also global known as instance variable
		int findSquare(int x){	//this method is global
			return x*x ;
		}
	%>
	<%-- now calling this method from either scriptlet tag or expression tag--%>
	<%
		// calling findSquare() from scriptlet tag
		int num1 = 6;
		int result = findSquare(num1);
		out.println("Square of "+num1+" is:"+result);	//out is explicit object among 9 explicit objects in JSP
		out.println("<br>Value of local num1 = "+num1);	//6
		out.println("<br>Value of global num1 = "+this.num1);	//56
	%>
	<br>
	<%=
		// calling findSquare() from expression tag
		"Square of 45 is "+ findSquare(45)	// no semicolon
	%>
	<%= "Value of global num1 = "+num1 %>
</body>
</html>