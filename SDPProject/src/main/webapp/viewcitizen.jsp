<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-image: url('images/citi.jpeg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
th {
  background-color: #04AA6D;
  color: black;
  cursor: pointer;
}

th, td {
  padding: 10px;
  text-align: left;
  color: black;
}
ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: none;

                width: 300px;
                display: flex;
                flex-direction: row;
                list-style: none;
                border-radius: 25px;
                background-color: #18181b
                boxshadow: 0 4px 8px 0 #0ffff, 0 6px 20px 0 rgba(0, 0, 0, 0.19);
               
}

li 
{
  float: right;
    border-right: black;
    
}

li a 
{
  display: block;
  color: rgb(255,215,0);
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: gray;
color: rgb(255,215,0);
}
li a:hover {
  background-color: orange;
  color: white;
}

tr:nth-child(odd):hover{
background-color: #1c2a44;
transform: scale(1.5);
transition: transfrom 300ms ease-in;
}

tr:nth-child(even):hover{
background-color: #1c2a44;
transform: scale(1.5);
transition: transfrom 300ms ease-in;
}
.box{
	background-color:#ffffff8a;
	color:white;
	width: fit-content;
}
</style>
</head>
<body>

<h1 align=center>Profile</h1>

<br>

<ul>
  <li><a href="ctzhome">Home</a></li>
  <li><a href="cchangepwd">Change Password</a></li>
   <li><a href="citizenlogin">Logout</a></li>
</ul>


<br>
<br>
<br>
<br>
<br>
<center>
<div class="box">
	<table align="center" style="margin-top:-18px;">
	
	<tr><th>ID:</th>&nbsp;<td>${ctz.id}</td></tr>
	<tr><th>Name:</th>&nbsp;<td>${ctz.name}</td></tr>
	<tr><th>Gender:</th>&nbsp;<td>${ctz.gender}</td></tr>
	<tr><th>Sector:</th>&nbsp;<td>${ctz.sector}</td></tr>
	<tr><th>Age:</th>&nbsp;<td>${ctz.age}</td></tr>
	<tr><th>Email ID:</th>&nbsp;<td>${ctz.emailid}</td></tr>
	<tr><th>Contact No:</th>&nbsp;<td>${ctz.contactno}</td></tr>
	
	
	
	</table>
</div>
</center>



</body>
</html>

 
