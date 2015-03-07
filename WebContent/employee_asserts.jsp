<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
<script type="text/javascript" src=""></script>
</head>
<body>
    Customize Yourselves by <b><a href="loginGateway.cgi">login</a></b>
	<center>
		<img src='<c:url value="/portal/images/APOnline-Final.jpg"/>' class="logo"/>
		<h3>
			<a href="aboutus.cgi">About us !...</a> 
		</h3>

		<h3>
			<a href="employee.cgi">Employee List</a>
		</h3>

		<h3>
			<a href="showEmployeeForm.cgi">Add Employee</a>
		</h3>
		
		
		<h3>
			<a href="updateEmployeeForm.cgi">Update Employee</a>
		</h3>

		
		<h3>
			<a href="deleteEmployeeForm.cgi">Delete Employee</a>
		</h3>


	</center>
</body>
</html>