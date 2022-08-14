
var a, b, c;
a = 21;
b = "manoj";
c = new Date();


function prvar(){
	var a = 33
	var b = "prabaharan"
	return a+b
}
function pre() {
	return a + b;
}

function add(a, b) {
	return a + b;
}
function hello(thisDate) {
	document.write("hi this is javascript - " + thisDate);
}
var hai = function()
{
	alert("hai sir,good morning");
};

window.onload = function()
{
	var time = new Date();
	document.getElementById("btntext").onclick =
	function(){
		alert ("hello world from button" + time);
	};
};

/* html code

<script type="text/javascript">
		hai();
		alert(pre()); 
        alert(prvar());
		alert(add(100, 200));
		hello(new Date());
	</script>
</head>
<body>
	<button id = "btntext">click me</button>
</body>
</html>*/


