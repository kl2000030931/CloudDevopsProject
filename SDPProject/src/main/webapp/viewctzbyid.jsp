<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<style>
ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: none;
}

li 
{
  float: left;
    border-right: 1px solid white;
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
  .box{
  	background-color: blue;
  }

</style>
</head>
<body>

<h1 align=center>Indian Constitution System</h1>

<br>

<ul>
  <li><a  href="governmenthome">Home</a></li>
  <li><a href="viewallctz">View All Citizen</a></li>
  <li><a href="governmentlogin">Logout</a></li>
</ul>

<br>

<h3 align=right>Welcome&nbsp;<c:out value="${auname}"></c:out></h3>

<br>
<div class="box">

<table align=center>

<tr><th>ID:</th>&nbsp;<td>${ctz.id}</td></tr>
<tr><th>Name:</th>&nbsp;<td>${ctz.name}</td></tr>
<tr><th>Gender:</th>&nbsp;<td>${ctz.gender}</td></tr>
<tr><th>sector:</th>&nbsp;<td>${ctz.sector}</td></tr>
<tr><th>Age:</th>&nbsp;<td>${ctz.age}</td></tr>
<tr><th>Email ID:</th>&nbsp;<td>${ctz.emailid}</td></tr>
<tr><th>Contact No:</th>&nbsp;<td>${ctz.contactno}</td></tr>



</table>
</div>



</body>
</html>

 
