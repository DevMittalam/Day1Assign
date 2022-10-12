<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import="java.util.*" %>
    <%@page import="com.servlet.Course_data" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table ,th,td{
border :1px solid black;
}
.con{
margin : auto;
width :70%;
}
</style>
<body>
<h3>Courses</h3>
<table class="con">
  <tr>
	<th>Course_Id</th>
	<th>Course_Name</th>
	<th>Duration</th>
	<th>Course_Fee</th>
  </tr>
  <c:forEach items="${c}" var="co">
  <tr>
  <td>${co.getCourse_id()}</td>
  <td>${co.getCourse_Name()}</td>
  <td>${co.getDuration()}</td>
  <td>${co.getCourse_Fee()}</td>
  </tr>
 </c:forEach>  
</table>
</body>
</html>