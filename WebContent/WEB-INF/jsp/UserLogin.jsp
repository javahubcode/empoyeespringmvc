<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/header-styles.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to AP Online Employee Portal || Login Page</title>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.validate.js"></script>
<script>
alert("hello");
$().ready(function() {
	// validate the comment form when it is submitted
	//$("#commentForm").validate();

	// validate signup form on keyup and submit
	$("#loginForm").validate({
		rules: {
			userName: "required",
			userName: {
				required: true,
				minlength: 5
			},
			password: {
				required: true,
				minlength: 5
			}
		},
		messages: {
			
			userName: {
				required: "Please enter a username",
				minlength: "Your username must consist of at least 2 characters"
			},
			password: {
				required: "Please provide a password",
				minlength: "Your password must be at least 5 characters long"
			}
		}
	});

</script>
</head>
<body>
	<jsp:include page="menuHeader.jsp"></jsp:include>
	<br>
	<br>
	<center>
		<img src='<c:url value="/portal/images/APOnline-Final.jpg"/>'
			class="logo" /> <a href="index.jsp"> <img
			src='<c:url value="/portal/images/home.jpg"/>' class="logo"
			TITLE="Go to Home Page" /></a>
	</center>

	<form:form id="loginForm" method="post" modelAttribute="loginEntity"
		action="validateUserLogin.cgi">
		<table align="center">
			<tr>
				<td>User Name</td>
				<td><form:input path="userName"></form:input></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password"></form:password></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="login"></td>
				<td><b><a href="userRegistrationGateway.cgi">User
							Register</a> | </b></td>
				<td><b><a href="userHelp.cgi">Forget User name or
							Password</a></b></td>
			</tr>
		</table>
	</form:form>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>