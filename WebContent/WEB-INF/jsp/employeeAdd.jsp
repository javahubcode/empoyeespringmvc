<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Welcome to Employee Track Portal || Add Employee</title></head>
<script type="text/javascript" src="js/security/securityAsserts.js"></script>
<body>
<jsp:include page="menuHeader.jsp"></jsp:include>
<br>
<center> <img src='<c:url value="/portal/images/APOnline-Final.jpg"/>' class="logo"/>
	<a href="employee_asserts.jsp"> <img src='<c:url value="/portal/images/home.jpg"/>' class="logo" TITLE="Go to Home Page" /></a></center>
	<form:form method="post" modelAttribute="employeeEntity"
		action="addEmployee.cgi">
		<table align="center">
			<tr>
				<td>Employee no</td>
				<td><form:input path="eno"></form:input></td>
			</tr>
			<tr>
				<td>Employee name</td>
				<td><form:input path="ename"></form:input></td>
			</tr>
			<tr>
				<td>Employee Department Number</td>
				<td><form:input path="dno"></form:input></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submitfrom"></td>
			</tr>
		</table>
	</form:form>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>