<html>
<head>
<script src="assets/js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script src="assets/js/jquery-ui-1.8.2.custom.min.js"
	type="text/javascript"></script>
<script type="text/javascript"
	src="assets/js/security/jquery.jcryption-1.1.min.js"></script>
<script src="assets/js/framework.js" type="text/javascript"></script>
<script type="text/javascript">
	// Get Encryption Keys

	jQuery(document).ready(function() {
		getKeys();
		//alert('hello');
		$("#login_button").click(onLoginButtonClicked);
		alert('hello');
	});
</script>

</head>
<body>
<h2>Javascript-Java RSA 512 Encryption example!</h2>
<fieldset><legend>Login Form</legend> <label>Username:</label><input
	type="text" id="login_user" value=""> <label>Password:</label><input
	type="password" id="login_password" value=""> <input
	type="button" id="login_button" value="login"></fieldset>

</body>

<span id="login_status"></span>
</html>
