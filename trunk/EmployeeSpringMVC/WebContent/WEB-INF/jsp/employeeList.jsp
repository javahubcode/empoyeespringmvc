<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - Employee List</title>
</head>
<body>
 <b> 
 <c:if test="${result != null}">
 Status:${result}
</c:if></b>
	<center>
	   
		<center> <img src='<c:url value="/portal/images/APOnline-Final.jpg"/>' class="logo"/>
		<a href="employee_asserts.jsp"> <img src='<c:url value="/portal/images/home.jpg"/>' class="logo" TITLE="Go to Home Page" /></a></center>
		<table border="3">
		<tr><th>Employee number </th><th>Employee name</th><th> Department Number</th></tr>
		<c:forEach items="${employeeList}" var="employee">
			<tr><td>${employee.eno}</td><td> ${employee.ename}</td><td> ${employee.dno}</td></tr>
		</c:forEach>
		</table>
	</center>
	Do you want to add More Employees  <a href="showEmployeeForm.cgi"><b>Add Employee</b></a>
</body>
</html>