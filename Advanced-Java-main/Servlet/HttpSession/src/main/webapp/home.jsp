<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = (String) session.getAttribute("name_key");
	%>
	<h3 style="text-align: center; font-size: 50px; color: darkcyan;">
		Welcome :
		<%=name%></h3>

	<a href="home.jsp">Profile</a> &nbsp;&nbsp;
	<a href="about.jsp">About</a>
</body>
</html>