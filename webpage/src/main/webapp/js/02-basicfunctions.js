// var x = new Object();

var x = {
     Name : "rajkumar",
     location : "sirkali",
     Work : "shop"
     
};
 alert("x work is - " + x.Work);
 
 var y = {
	name: "praveen",
	job: "gov work",
	salary: 50000,
	
	toString: function(){
		return this.name + " | " + this.job + " | " + this.salary;
	}
};
alert("y info is - " + y.toString());

window.onload = function()
{
	document.getElementById("btntext").onclick = 
	function(){
		document.write("hi this is button text")
	}
	/*function(){
		alert("hi sir from button");
	}*/
};