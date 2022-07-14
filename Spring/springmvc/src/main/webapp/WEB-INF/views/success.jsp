<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1>${Header }</h1>
<p> ${Desc }</p>
<h1> Welcome, ${user.userName } </h1>
<h1> Your email is ${user.email } </h1>
<h1> And your password is ${user.password } </h1>
<h1 style= "color:green"> ${msg }</h1>
</body>
</html>

