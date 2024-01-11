<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
    body {
        font-family: Arial, sans-serif;
        font-weight: bold;
    }
    
    form {
        max-width: 400px;
        margin: 0 auto;
        padding: 20px;
        border: 3px solid black;
        border-radius: 10px;
        background-color: #E0E8F0;
    }
    
    input[type="text"],
    input[type="password"] {
        width: 90%;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid black;
        border-radius: 3px;
    }
    .center-button {
        text-align: center;
    }
    
    input[type="submit"] {
        background-color: green;
        color: white;
        font-weight: bold;
        padding: 10px 15px;
        border: 2px solid black;
        border-radius: 10px;
        cursor: pointer;
    }
    
    div.message {
        font-size: 30px;
        margin-top: 40px;
        color: green;
        text-align: center;
    }
    div.errorMessage {
        font-size: 30px;
        margin-top: 40px;
        color: red;
        text-align: center;
    }
    h1 {
        text-align: center;
        color: green;
        text-shadow: 0px 2px 2px black;
    }
</style>
</head>
<body>
  <h1>Login form using JSP</h1>
   <form action="loginForm" method="post">
     Email: <input type="text" name="email"/> <br><br>
     Password: <input type="password" name="password"/> <br><br>
     <div class="center-button">
         <input type="submit" value="Login"/>    
     </div>    
   </form>
   
   <% String message = request.getParameter("message"); %>
    <% if (message != null && !message.isEmpty()) { %>
        <div class="message"><%= message %></div>
    <% } %>
    
    <% String errorMessage = (String) request.getAttribute("errorMessage"); %>
    <% if (errorMessage != null && !errorMessage.isEmpty()) { %>
        <div class="errorMessage"><%= errorMessage %></div>
    <% } %>
</body>
</html>