<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
 <a href="add">add product</a><br>
 <a href="delete">delete product</a><br>
 <a href="/show">show product</a>
 <form action="/part">
 enter product id :
 <input type="text" name="id">
 <input type="submit" value="submit">
 </form>
</body>
</html>