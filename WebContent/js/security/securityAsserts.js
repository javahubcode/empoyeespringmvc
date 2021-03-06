//using Javascript 

function preventBack() {
	window.history.forward();
}
setTimeout("preventBack()", 0);
window.onunload = function() {
	null
};

// Using Jquery disable back button
$(document).ready(function() {
	function disableBack() {
		window.history.forward()
	}

	window.onload = disableBack();
	window.onpageshow = function(evt) {
		if (evt.persisted)
			disableBack()
	}
});

// prevent CTRL+C, CTRL+V and CTRL+X Operations

// Disable right mouse click Script
var message = "Function Disabled!";
// /////////////////////////////////
function clickIE4() {
	if (event.button == 2) {
		alert(message);
		return false;
	}
}
function clickNS4(e) {
	if (document.layers || document.getElementById && !document.all) {
		if (e.which == 2 || e.which == 3) {
			alert(message);
			return false;
		}
	}
}
if (document.layers) {
	document.captureEvents(Event.MOUSEDOWN);
	document.onmousedown = clickNS4;
} else if (document.all && !document.getElementById) {
	document.onmousedown = clickIE4;
}
document.oncontextmenu = new Function("return false")

function disableCtrlKeyCombination(e) {
	// list all CTRL + key combinations you want to disable
	var forbiddenKeys = new Array('a', 'c', 'x', 'v');
	var key;
	var isCtrl;
	if (window.event) {
		key = window.event.keyCode; // IE
		if (window.event.ctrlKey)
			isCtrl = true;
		else
			isCtrl = false;
	} else {
		key = e.which; // firefox
		if (e.ctrlKey)
			isCtrl = true;
		else
			isCtrl = false;
	}
	// if ctrl is pressed check if other key is in forbidenKeys array
	if (isCtrl) {
		for (i = 0; i < forbiddenKeys.length; i++) {
			// case-insensitive comparation
			if (forbiddenKeys[i].toLowerCase() == String.fromCharCode(key)
					.toLowerCase()) {
				alert('Key combination CTRL + ' + String.fromCharCode(key)
						+ ' has been disabled.');
				return false;
			}
		}
	}
	return true;
}
