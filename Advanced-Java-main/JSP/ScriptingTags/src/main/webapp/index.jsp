<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <%!
     int a = 20;
     String name = "Mario";
     int add(){
    	return a + a;
     }
   %>
   
   <%
     out.println("The value is: "+a);
     out.println("Name is: "+ name);
     out.println(add());
     
     int b = 10;
     
     if(b < 50){
    	 out.println("b is smaller that 50");
     } else {
    	 out.println("b is greater than 50");
     }
     
     for(int i = 0; i<=10; i++){
    	 out.println(i);
     }
     
     //String name = request.getParameter("---");
   %>
   
   <%= a %>
   <%= name %>
   <%= add() %>
   <%= LocalDate.now() %>
   <%= Math.random() %>
</body>
</html>