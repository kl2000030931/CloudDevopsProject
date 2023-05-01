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
color: orange;
}
li a:hover {
  background-color: orange;
  color: white;
}
body {
  background-image: url('images/sci.png');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
</head>
<body>

<h1 align=center>Indian Constitution System</h1>

<br>

<ul>
  <li><a class="active" href="governmenthome">Home</a></li>
  <li><a href="viewallctz">View All Users</a></li>
  <li><a href="viewallarticles">View all Articles</a>
  <li><a href="newarticle">Add Articles</a>
   <li><a href="governmentlogin">Logout</a></li>
</ul>

<br>

<h3 align=center>Welcome&nbsp;<c:out value="${auname}"></c:out></h3>

<%-- <div class="alignRow">
<div class="imageColumn">
<center>
<img src="images/sci.png" alt="img1" style="width:400%">
</center>
</div> --%>
</div>

</body>
</html>

 
