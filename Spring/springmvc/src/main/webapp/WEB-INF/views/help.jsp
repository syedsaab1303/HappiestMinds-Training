<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDateTime"%>


<%@ page isELIgnored="false" %>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <!-- for  using jstl -->


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to help page</title>
</head>
<body>


<%
String name=(String) request.getAttribute("name");
Integer rollno=(Integer) request.getAttribute("rollnumber");
LocalDateTime time=(LocalDateTime) request.getAttribute("time");
%>

<h1> Hello! My name is 
<%-- <%=name %> --%>
${name} <!-- this  is expression language format ${  } -->
</h1>

<h1> 
My roll number is
<%-- <%=rollno %> --%>
${rollno}
</h1>

<h1> 
Date and TIme is
<%-- <%=time.toString() %> --%>
${time}
</h1>

<hr>

<c:forEach var="item" items="${marks}" >
 <%-- <h1>${item }</h1> --%>
<h1> <c:out value="${item}" ></c:out> </h1> <%--other way to print --%>
</c:forEach>



</body>
</html>



