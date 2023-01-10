<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Detail Page</title>
</head>
<body>

<h1>${Header}</h1>

<h1>user name: ${user.username }</h1>
<h1>User Email: ${user.email}</h1>
<h1>password: ${user.password }</h1>
</body>
</html>