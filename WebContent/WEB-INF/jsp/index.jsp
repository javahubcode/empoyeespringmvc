<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<title>Welcome to Employee Track Portal || Index</title>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/extFormvalidation.js"></script>
<style type="text/css">
div.menu3 {
	/*width:500px;margin:0 auto;*/
	/*Uncomment this line to make the menu center-aligned.*/
	text-align: center;
	font-size: 0;
	height: 25px;
	*position: relative;
	*top: 1px; /*Hacks for IE6 & IE7 */
}

div.menu3 a {
	display: inline-block;
	padding: 0 20px;
	margin-right: 1px; /* It specifies the distance between each tab */
	background: #F7F7F7;
	color: Black;
	text-decoration: none;
	font: normal 12px Arial;
	line-height: 24px;
	border: 1px solid #CAD0DB;
	border-bottom: 0;
	color: #666;
	vertical-align: top; /*ChangeSet#2*/
	text-decoration: none;
}

div.menu3 a:hover, div.menu3 a.current {
	background: #E9ECF0;
	line-height: 25px;
	color: #000;
}

div.menu3sub {
	height: 6px;
	border: 1px solid #CAD0DB;
	background: #E9ECF0;
}
</style>
</head>
<body>
<div align="right" ><b>Existing User? <a href="loginGateway.cgi" onclick="fun()">login</a></b></div>
<jsp:include page="menuHeader.jsp"></jsp:include>
<br>
	<b>Welcome to Employee Track Portal</b>
	<a href="employee_asserts.jsp">CLICK Here</a>
		<%=request.getContextPath()%>
		
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>