<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h3>Java Server Pages</h3>
   
   <%
     String name = "Mario";
   int length = name.length();
   
   %>
   <%= length %>
</body>
</html>