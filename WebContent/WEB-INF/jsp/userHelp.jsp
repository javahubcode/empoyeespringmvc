
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<jsp:include page="menuHeader.jsp"></jsp:include>
<br>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/header-styles.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
<title>Welcome to AP Online Employee Portal</title>
<style>
.divBackground {
	background-color: #ccffcc;
}

body {
	float: center;
}

.success {
	background-color: #ccffcc;
}

.active {
	background-position: -115px -50px;
}

.gend {
	background-position: -115px -50px;
}

.gend span.active b {
	color: #333333;
}

.gend span.active i {
	background-position: -115px -50px;
}

.gend span.active i .ei {
	_margin: -50px 0 0 -115px;
}
</style>
<script language="javascript">
	function changeGender(id) {
		var gender = document.getElementById(id).value;
		// alert('Gender values:'+gender);
		if (gender == 'M') {
			//alert(gender);
			var lableText = document.getElementById('radio1');
			lableText.style.color = "red";
		} else if (gender == 'F') {
			//	alert(gender);
			var lableText = document.getElementById('radio2');
			lableText.style.color = "green";
		}
	}
	$(function() {
		$('.date-picker')
				.datepicker(
						{
							changeMonth : true,
							changeYear : true,
							showButtonPanel : true,
							dateFormat : 'MM yy',
							onClose : function(dateText, inst) {
								var month = $(
										"#ui-datepicker-div .ui-datepicker-month :selected")
										.val();
								var year = $(
										"#ui-datepicker-div .ui-datepicker-year :selected")
										.val();
								$(this).datepicker('setDate',
										new Date(year, month, 1));
							}
						});
	});
</script>
</head>
<body>

 <jsp:include page="menuHeader.jsp"></jsp:include>
	<center>
		<img src='<c:url value="/portal/images/APOnline-Final.jpg"/>'
			class="logo" /> <a href="employee_asserts.jsp"> <img
			src='<c:url value="/portal/images/home.jpg"/>' class="logo"
			TITLE="Go to Home Page" /></a>
	</center>

	<form:form method="post" modelAttribute="loginEntity"
		action="validateUserLogin.cgi">

		<div class="divBackground" align="center">
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

					<td>Gender</td>
					<td>
						<div id="genderDiv" class="gend">
							<form:radiobutton id="male" path="gender" value="M"
								onclick="javascript:changeGender(this.id);" />
							<span id="radio1">Male</span>
							<form:radiobutton id="female" path="gender" value="F"
								onclick="javascript:changeGender(this.id);" />
							<span id="radio2">female</span>
						</div>
					</td>
				</tr>
				<tr>
					<td>Date of Birth (DD/MM/YYYY)*</td>
					<td><form:input path="DOB"
							class="date-picker" /></td>
				</tr>
				<tr>

					<td></td>
					<td><input type="submit" value="login"></td>

					<td></td>
				</tr>
			</table>
		</div>
		<jsp:include page="footer.jsp"></jsp:include>
	</form:form>

</body>
</html>