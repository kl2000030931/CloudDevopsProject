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

.imageColumn {
   float: center;
   width: 25%;
   padding: 10px;
}

li 
{
  float: left;
    border-right: 1px solid black;
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
background-color: black;
color: rgb(255,215,0);
}
li a:hover {
  background-color: black;
  color: white;
}
body {
  background-image: url('images/citi.jpeg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
</head>
<body>

<h1 align=center>Indian Constitutional System</h1>
<h3 align=center>Welcome&nbsp;<c:out value="${cuname}"></c:out></h3>
<br>

<ul style="widows: 80%">
  <li><a class="active" href="ctzhome">Home</a></li>
  <li><a href="viewctz">View Profile</a></li>
  <li><a href="articlesforctz">Articles</a>
  <li><a href="citizenlogin">Logout</a></li>
</ul>

<br>

<%-- <h3 align=right>Welcome&nbsp;<c:out value="${cuname}"></c:out></h3> --%>

<%-- <div class="alignRow">
<div class="imageColumn">
<center>
<img src="images/sci.png" alt="img1" style="width:420%">
</center>
</div>
</div> --%>

</body>
</html>

 
