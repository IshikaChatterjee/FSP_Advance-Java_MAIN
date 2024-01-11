<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Welcome Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
            padding: 20px;
        }
        h3 {
            color: #333;
            font-size: 40px;
            margin-top: 20px;
        }
        img {
          height: 50%;
          width: 50%;
        }
    </style>
</head>
<body>
    <h3>Welcome, ${session_name} to the Advanced Java Class</h3>
    <img src="java.png" alt="advanced java" title="advanced java">
</body>
</html>