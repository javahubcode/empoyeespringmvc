
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
<link rel="stylesheet" href="jquery-ui.css">
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script type="text/javascript" src="jquery-ui.min.js"></script>
<script type="text/javascript" src="jquery-1.11.2.min.js"></script>
<script src="jquery-ui.js"></script>
<script src="jquery.validate.min.js"></script>
<script type="text/javascript" src="js/security/securityAsserts.js"></script>

<title>Welcome to AP Online Employee Portal || User Registration
	Page</title>
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

//
Code added for scrollup
.scrollup {
	width: 40px;
	height: 40px;
	opacity: 0.3;
	position: fixed;
	bottom: 50px;
	right: 100px;
	display: none;
	text-indent: -9999px;
	background-color: green;
}
</style>
<script language="javascript">
<!--Here Jquery form validations will apply-->
	$(function() {
		$('#validateUserLogin')
				.validate(
						{
							rules : {
								userName : "required",
								password : {
									required : true,
									minlength : 8
								},
								emailId : {
									required : true,
									email : true
								},
								recoveryEmailId : {
									required : true,
									email : true
								},
								agree : {
									required : true,
								},
								phoneNumber : {
									required : true,
									digits : true,
									minlength : 10
								},
								officePhoneNumber : {
									required : true,
									//phoneUK : true
									digits : true
								},
								datepicker : {
									required : true,
									//AccurateDate : true
									dpDate : true
								},
								securityAnswer : "required",
								securityQuestions : "required",
								address1 : "required",
								address2 : "required",
								reCaptcha : "required"

							},
							messages : {
								userName : "User Name Required",
								password : {
									required : "Password Required",
									minlength : "Password should be minimum 8 Characters long"
								},
								emailId : "Please enter a valid Email Id",
								recoveryEmailId : "Please Enter a valid Recovery Email Id",
								agree : "In order to use our services, you must agree to Employee Online Portal's Terms & Conditions",
								phoneNumber : {
									required : "&nbsp;Phone Number required",
									digits : "&nbsp;Only numbers accepted",
									minlength : "&nbsp;Ten numbers are required."
								},
								officePhoneNumber : {
									required : "&nbsp;Telephone required",
									digits : "&nbsp;Only numbers accepted"
								//minlength : "&nbsp;Ten numbers are required."
								//phoneIN : "Please enter Indian Telephone"
								},
								datepicker : {
									required : "Please enter Date Of Birth"
								},
								securityAnswer : "Please enter Security Answer",
								securityQuestions : "Please select Security Question",
								address1 : "Please select Address Line 1",
								address2 : "Please select Address Line 2",
								reCaptcha : "Please enter Captcha Image "
							},
							errorPlacement : function(error, element) {
								var name = $(element).attr("name");
								error.appendTo($("#" + name + "_validate"));
							},
							submitHandler : function(form) {
								//	validateAsserts();
								form.submit();
							}
						});

	});
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

	$(document).ready(function() {

		$(window).scroll(function() {
			if ($(this).scrollTop() > 100) {
				$('.scrollup').fadeIn();
			} else {
				$('.scrollup').fadeOut();
			}
		});

		$('.scrollup').click(function() {
			$("html, body").animate({
				scrollTop : 0
			}, 600);
			return false;
		});

	});

	$(document).ready(function() {
		//$("#msgid").html("This is Hello World by JQuery");
		// alert('Hello');
	});

	$(function() {
		$("#datepicker").datepicker();
	});

	function validateAsserts() {
		document.getElementById('officePhoneNumber_validate').innerHTML = "";
		//Here We are validating only telephone numbers
		var value = document.getElementById('officePhoneNumber').value;
		var reg = new RegExp('^[-]?[0-9]+[\.]?[0-9]+$');
		if (value.length != 10 || !reg.test(value)) {
			//alert('validating Javascript officePhoneNumber'+value);
			document.getElementById('officePhoneNumber_validate').innerHTML = "Please enter a Valid Telephone number(11)";
			return false;
		}
		return true;

	}

	function validatePanCard(id) {
		var value = document.getElementById(id).value;
		var regex1 = /^[A-Z]{5}\d{4}[A-Z]{1}$/;
		if (!regex1.test(value) || value.length != 10) {

			return false;
		}
		return true;
	}
	//  Validate SSN (Social security Number):
	function validateSSN(id) {
		var ssn = document.getElementById(id).value;
		var pattern = /^\d{3}-\d{2}-\d{4}$/;
		if (ssn.match(pattern))
			alert("OK");
		else
			alert("Not OK");
	}
	//Prevent CTR+V,CTR+C AND CTRL+A operations for password
	$(document).ready(function() {
		$('#password').bind("cut copy paste", function(e) {
			e.preventDefault();
		});

	});
	//Prevent CTR+V,CTR+C AND CTRL+A operations for Primary emai id
	$(document).ready(function() {
		$('#emailId').bind("cut copy paste", function(e) {
			e.preventDefault();
		});

	});
	//Prevent CTR+V,CTR+C AND CTRL+A operations for mobile number
	$(document).ready(function() {
		$("#phoneNumber").bind("cut copy paste", function(e) {
			e.preventDefault();
		});

	});
</script>
<script src='https://www.google.com/recaptcha/api.js'></script>
</head>
<!-- <body onkeypress="return disableCtrlKeyCombination(event);" onkeydown = "return disableCtrlKeyCombination(event);">  -->
<body>
	<marquee direction="right" behavior="scroll" bgcolor="RED">Breaking
		news ..NBK Played Jokes !...</marquee>
	<jsp:include page="menuHeader.jsp"></jsp:include>
	<div id="msgid"></div>

	<center>
		<img src='<c:url value="/portal/images/APOnline-Final.jpg"/>'
			class="logo" /> <a href="employee_asserts.jsp"> <img
			src='<c:url value="/portal/images/home.jpg"/>' class="logo"
			TITLE="Go to Home Page" /></a>
	</center>

	<form:form method="post" id="validateUserLogin"
		modelAttribute="loginEntity" action="validateUserLoginAndPostData.cgi">

		<div class="divBackground" align="center">
			<table align="center">
				<tr>
					<td align="right">User Name</td>
					<td><form:input id="userName" path="userName"></form:input> <label
						id="userName_validate" style="font-family: fantasy;"></label></td>
				</tr>
				<tr>
					<td align="right">Password</td>
					<td><form:password id="password" path="password"></form:password>
						<label id="password_validate" style="font-family: fantasy;"></label></td>
				</tr>
				<tr>

					<td align="right">Gender</td>
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
					<td align="right">Date of Birth</td>
					<!-- <td> <form:input path="DOB" cssClass="date-picker" /> </td> -->
					<td><form:input path="DOB" id="datepicker" name="DOB"
							class="{validate:{required:true, date:true}}" /> <label
						id="datepicker_validate" style="font-family: fantasy;"></label></td>
				</tr>
				<tr>
					<td align="right">Address1</td>
					<td><form:input path="address1" id="address1"></form:input> <label
						id="address1_validate" style="font-family: fantasy;"></label></td>
				</tr>
				<tr>
					<td align="right">Address2</td>
					<td><form:input path="address2" id="address2"></form:input> <label
						id="address2_validate" style="font-family: fantasy;"></label></td>
				</tr>
				<tr>
					<td align="right">Phone Number</td>
					<td><form:input path="phoneNumber" id="phoneNumber"></form:input>
						<label id="phoneNumber_validate" style="font-family: fantasy;"></label></td>
				</tr>
				<tr>
					<td align="right">Office Phone Number</td>
					<td><form:input path="officePhoneNumber"
							id="officePhoneNumber"></form:input> <label
						id="officePhoneNumber_validate" style="font-family: fantasy;"></label></td>
				</tr>
				<tr>
					<td align="right">Email</td>
					<td><form:input id="emailId" path="emailId"></form:input> <label
						id="emailId_validate" style="font-family: fantasy;"></label></td>
				</tr>
				<tr>
					<td align="right">Recovery Email</td>
					<td><form:input id="recoveryEmailId" path="recoveryEmailId"></form:input>
						<label id="recoveryEmailId_validate" style="font-family: fantasy;"></label></td>
				</tr>
				<tr>
					<td>Select Security Question</td>
					<td><form:select multiple="single" path="securityQuestions">

							<form:option value="" label="--- Select ---" />
							<form:options items="${securityQuestionsList}" />
						</form:select> <label id="securityQuestions_validate"
						style="font-family: fantasy;"></label></td>
				</tr>
				<tr>
					<td align="right">Security Answer</td>
					<td><form:input id="securityAnswer" path="securityAnswer"></form:input>
						<label id="securityAnswer_validate" style="font-family: fantasy;"></label></td>
				</tr>
				<tr>
					<td>Please enter Captcha</td>
					<td><div class="g-recaptcha" id="reCaptcha"
							data-sitekey="6LcnsP8SAAAAANCCxRzu22YE7NNtZb4ZsLQEo2mZ"></div> <label
						id="reCaptcha_validate" style="font-family: fantasy;"></label></td>

				</tr>
				<tr>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
						type="checkbox" name="agree" value="1" id="agree">
					<td>I agree to Terms and Conditions of Employee Portal
						Services
				</tr>
			</table>
			<label id="agree_validate"
				style="font-family: fantasy; border-color: red;"></label> <br>
			<input type="submit" value="login" onclick="return validateAsserts()">
		</div>
		<div align="right">
			<a href="#" class="scrollup"><b>Scroll Up</b></a>
		</div>

		<div id="agree_validate"></div>

	</form:form>

</body>
</html>