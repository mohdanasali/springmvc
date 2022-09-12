<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="springmvcsearch.model.Student" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user data</title>
</head>
<body>
<%Student student = (Student)request.getAttribute("student"); %>
<h1><%=student %></h1>
<body/>
</html>