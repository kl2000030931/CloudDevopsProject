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
  background-color: lightgreen;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: black;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: orange;
  color: white;
}
</style>
</head>
<body>

<h1 align=center>Indian Constitution System</h1>

<br>

<ul>
  <li><a  href="ctzhome">Home</a></li>
  <li><a href="articlesforctz">View All Articles</a></li>
  <li><a href="governmentlogin">Logout</a></li>
</ul>

<br>


<h3 align=right>Welcome&nbsp;<c:out value="${cuname}"></c:out></h3>

<table align=center>

<tr><th>ID:</th>&nbsp;<td>${arts.no}</td></tr>
<tr><th>Name:</th>&nbsp;<td>${arts.name}</td></tr>
<tr><th>Description:</th>&nbsp;<td>${arts.description}</td></tr>




</table>



</body>
</html>

 
