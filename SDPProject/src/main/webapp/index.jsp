<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

<html>
<head>
<style>
ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px 570px;
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
  color: black /* rgb(255,215,0) */;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: gray;
color: orange;
}
li a:hover {
  background-color: orange;
  color: white;
}
body {
  background-image: url('images/home.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
</head>
<body >

<h1 align=center>Indian Constitutional System</h1>

<br>

<ul>
  <li><a class="active" href="/">Home</a></li>
  <li><a href="governmentlogin">Admin</a></li>
  <li><a href="citizenlogin">User</a></li>
</ul>
<%-- <div class="alignRow">
<div class="imageColumn">
<center>
<img src="images/home.jpg" alt="img1" style="width:100%;"> 
</center>
</div>
 --%>
</body>
</html>