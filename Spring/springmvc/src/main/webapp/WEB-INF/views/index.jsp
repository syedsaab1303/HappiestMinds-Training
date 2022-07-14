<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
  
    <!-- create a view to show page -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h1> This is home page</h1>
<h1> called by Home Controller</h1>
<h1>url/home</h1>

<%
String name=(String) request.getAttribute("name");
Integer id =(Integer) request.getAttribute("id");
List<String> friends= (List<String>) request.getAttribute("f");
%>


<h1> Name is <%=name %></h1>
<h1> Id  is <%=id %></h1>

<%
for(String s:friends){
	out.println(s);
%>
<h1> <%=s %></h1>

<%
}
%>
</body>
</html>


<!--Note:-  here view is jsp -->
