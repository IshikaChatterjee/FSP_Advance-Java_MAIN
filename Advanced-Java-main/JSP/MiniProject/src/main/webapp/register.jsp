<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mini Project</title>
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
        input[type="email"],
        input[type="password"],
        select {
            width: 90%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid black;
            border-radius: 3px;
        }
        input[type="radio"] {
            padding-left: 10px;
            margin-bottom: 10px;
        }
        select {
            height: 35px;
        }

        .center-button {
            text-align: center;
        }
        
        input[type="submit"] {
            background-color: green;
            font-weight: bold;
            color: white;
            padding: 10px 15px;
            border: 2px solid black;
            border-radius: 10px;
            cursor: pointer;
        }
        
        h3 {
            margin-top: 20px;
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
   <h1>Registration form using JSP</h1>
   <form action="regForm" method="post">
     Name: <input type="text" name="username" required/> <br><br>
     Email: <input type="email" name="email" required/> <br><br>
     Password: <input type="password" name="password" required/> <br><br>
      Gender: 
     <label><input type="radio" name="gender" value="Male" required/>Male</label>
     <label><input type="radio" name="gender" value="Female" required/>Female</label><br><br>
     City: <select name="city" required>
               <option>Select City</option>
               <option>Kolkata</option>
               <option>Delhi</option>
               <option>Mumbai</option>
               <option>Banglore</option>
               <option>Pune</option>
           </select> <br><br>    
       <div class="center-button">
         <input type="submit" value="Register"/>    
       </div>   
   </form>
   <% String errorMessage = (String) request.getAttribute("errorMessage"); %>
    <% if (errorMessage != null && !errorMessage.isEmpty()) { %>
        <h3 style='color: red;'><%= errorMessage %></h3>
    <% } %>
</body>
</html>