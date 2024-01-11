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
     request.setAttribute("request_name", "Mario");
   //out.println(request.getAttribute("request_name"));
   %>
   <h3>Hello: ${requestScope.request_name}</h3>
   
   <% 
     session.setAttribute("session_pname","Virat Kohli");
   //out.println(session.getAttribute("request_pname"));
   %>
   <h3>Player name: ${session_pname}</h3>
   
   <form action="output.jsp">
      <input type="text" name="username" placeholder="Enter your username"/>
      <input type="submit" value="Submit"/>
   </form>
</body>
</html>