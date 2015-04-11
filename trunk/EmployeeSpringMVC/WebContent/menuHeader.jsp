<html>
<head>
<link rel="stylesheet" href="/css/header-styles.css">
<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
<script src="script.js"></script>
<title>CSS Employee Menu Maker</title>
</head>
<style type="text/css">
/* Derived from http://www.devinrolsen.com/pure-css-horizontal-menu/ */
#pagebody {
	position: inherit !important;
	width: 100%;
} /* DO NOT EDIT */
#pagebody-inner {
	position: inherit !important;
	width: 100%;
} /* DO NOT EDIT */
#alpha, #beta, #gamma, #delta {
	display: inline; /* DO NOT EDIT */
	position: inherit !important; /* DO NOT EDIT */
	float: left; /* DO NOT EDIT */
	min-height: 1px; /* DO NOT EDIT */
}

#centernav {
	width: 900px;
	/* if you want your nav centered, set this to the width of your container, if you don't want it centered, change this number to 100% */
	margin-left: auto;
	margin-right: auto;
}

#dropnav {
	height: 23px;
	background: #800033; /*Back-Ground color for Main menu bar*/
	} /* Changes the height and bg color of the main menu */
#dropnav ul {
	margin: 0px;
	padding: 0px;
}

#dropnav ul li {
	border-right: 1px solid white;
	display: inline;
	float: left;
	list-style: none;
	margin-left: 15px;
	position: relative;
	height: 25px;
	width: 150px;
} /* only edit the last 2 items - sets the width of the main menu */
#dropnav li a {
	color: #FFF;
	text-decoration: none;
} /* Changes the link color of items on the main menu */
#dropnav li a:hover {
	color: white; /* Font color for main menu items*/
	text-decoration: none;
} /* Changes the hover color of items on the main menu */
#dropnav li ul {
	border-top-left-radius: 6px;
	border-top-right-radius: 6px;
	border-bottom-left-radius: 6px;
	border-bottom-right-radius: 6px;
	margin: 0px;
	padding: 0px;
	display: none;
	position: absolute;
	left: 0px;
	z-index: 99;
	top: 25px;
	
}
/* Only edit the last 2 items - set the top margin and background color of the submenus */
#dropnav li:hover ul {
	display: block;
	width: 12px;
	background: #800033; /*#47c9af; /* slide Banner Back round Color*/
	
} /* sets the width of the submenus */
#dropnav li li {
	list-style: none;
	display: list-item;
} /* DO NOT EDIT */
#dropnav li li a {
	color: black; /* font color for each sub-list item*/
	text-decoration: none;
	font-family: inherit;
	font-size: medium;
	font-weight: lighter;
	box-shadow: 0px 0px 1px rgba(0, 0, 0, 0.235), 0px 0px 5px rgba(0, 0, 0, 0.047);
} /* Changes the link color of items in the submenu */
#dropnav li li a:hover {
	padding: 1px;
	color: white; /* font color for each sub-list item when hover*/
	background-color: #800033;
		
	/* Back-Ground color for each sub-list item when hover*/
} /* Changes the hover color of items in the submenu */
li#main {
	padding-top: 2px;
} /* Sets the padding of items in the main menu */
</style>

<body>
<br>
	<div id="centernav">
		<div id="dropnav">
			<ul>

				<li id="main"><a href="home.cgi">Home</a></li>

				<li id="main"><a href="#">Services</a>
					<ul id="subnav">
						<li><div>
								<a href="#"><b>Services</b></a>
							</div></li>
						<li><div>
								<a href="#"><b>sub menu item 2</b></a>
							</div></li>
						<li><div>
								<a href="#"><b>sub menu item 3</b></a>
							</div></li>
						<li><div>
								<a href="#"><b>sub menu item 4</b></a>
							</div></li>
					</ul></li>

				<li id="main"><a href="#">Products</a>
					<ul id="subnav">
						<li><a href="#">sub menu item 1</a></li>
						<li><a href="#">sub menu item 2</a></li>
						<li><a href="#">sub menu item 3</a></li>
						<li><a href="#">sub menu item 4</a></li>
					</ul></li>

				<li id="main"><a href="#">Contact Us</a>

					<ul id="subnav">
						<li><a href="#">sub menu item 1</a></li>
						<li><a href="#">sub menu item 2</a></li>
						<li><a href="#">sub menu item 3</a></li>
						<li><a href="#">sub menu item 4</a></li>
					</ul></li>
			</ul>
		</div>
	</div>


</body>
<html>