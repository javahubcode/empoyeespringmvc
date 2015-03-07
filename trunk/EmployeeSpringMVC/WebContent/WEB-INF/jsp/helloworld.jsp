<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld</title>
</head>
<body>
<center> <img src='<c:url value="/portal/images/APOnline-Final.jpg"/>' class="logo"/>
<a href="employee_asserts.jsp"> <img src='<c:url value="/portal/images/home.jpg"/>' class="logo"  TITLE="Go to Home Page"/></a></center>
	<center>
		<h2>Hello World</h2>
		<h2>
		<b>${message}</b> 
		</h2>
		
	</center>
</body>
</html>