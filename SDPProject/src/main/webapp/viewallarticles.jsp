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
color: rgb(255,215,0);
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
tr:nth-child(odd):hover{
background-color: rgb(255,215,0);
transform: scale(1.5);
transition: transfrom 300ms ease-in;
}

tr:nth-child(even):hover{
background-color: rgb(255,215,0);
transform: scale(1.5);
transition: transfrom 300ms ease-in;
}
</style>
</head>
<body>

<h1 align=center>Indian Constitution System</h1>

<br>

<ul>
<center>
  <li><a href="governmenthome">Home</a></li>
  <li><a href="viewallctz">View All Users</a></li>
  <li><a class="active" href="viewallarticles">View all Articles</a>
  <li><a href="newarticle">Add Articles</a>
   <li><a href="governmentlogin">Logout</a></li>
  </center>
</ul>
    <br/><br/>
<h1 align=center>Indian Constitution System</h1>

<br>

<h3 align=center><u>View All Articles</u></h3>

<table align=center border=2>

<tr>

<th>ID</th>
<th>Name</th>
<th>Description</th>

<th>Action</th>

</tr>

<c:forEach items="${artslist}" var="arts">

<tr> 
<td> <c:out value="${arts.no}"></c:out> </td>
<td> <c:out value="${arts.name}"></c:out> </td>
<td> <c:out value="${arts.description}"></c:out> </td>
<td>
<a href='<c:url value='deleteartz?id=${arts.no}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a href='<c:url value='viewartbyid?id=${arts.no}'></c:url>'>View</a>&nbsp;&nbsp;
</td>
</tr>

</c:forEach>

    </table> 
</body>
</html>