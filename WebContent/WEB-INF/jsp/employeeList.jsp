<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/security/securityAsserts.js"></script>
<head>
<title>Welcome to Employee Track Portal || Employee Report</title></head>
<style type="text/css">
table {
	color: #333;
	font-family: Helvetica, Arial, sans-serif;
	width: 640px;
	border-collapse: collapse;
	border-spacing: 0;
}

td, th {
	border: 1px solid transparent; /* No more visible border */
	height: 30px;
	transition: all 0.3s; /* Simple transition for hover effect */
}

th {
	background: #DFDFDF; /* Darken header a bit */
	font-weight: bold;
}

td {
	background: #FAFAFA;
	text-align: center;
}

/* Cells in even rows (2,4,6...) are one color */
tr:nth-child(even) td {
	background: #F1F1F1;
}

/* Cells in odd rows (1,3,5...) are another (excludes header cells)  */
tr:nth-child(odd) td {
	background: #FEFEFE;
}

tr td:hover {
	background: #666;
	color: #FFF;
} /* Hover cell effect! */
</style>

</head>
<body>
<jsp:include page="menuHeader.jsp"></jsp:include>
	<b> <c:if test="${result != null}">
 Status:${result}
</c:if></b>
	<center>

		<center>
			<img src='<c:url value="/portal/images/APOnline-Final.jpg"/>'
				class="logo" /> <a href="employee_asserts.jsp"> <img
				src='<c:url value="/portal/images/home.jpg"/>' class="logo"
				TITLE="Go to Home Page" /></a>
		</center>
		<table border="3">
			<tr>
				<th>Employee number</th>
				<th>Employee name</th>
				<th>Department Number</th>
			</tr>
			<c:forEach items="${employeeList}" var="employee">
				<tr>
					<td>${employee.eno}</td>
					<td>${employee.ename}</td>
					<td>${employee.dno}</td>
				</tr>
			</c:forEach>
		</table>
	</center>
	Do you want to add More Employees
	<a href="showEmployeeForm.cgi"><b>Add Employee</b></a>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>