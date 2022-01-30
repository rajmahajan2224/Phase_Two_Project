<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>

<h1 style = "text-align : center; color: green;">Displaying the Product Details</h1>
<hr>
<%= "Product Id : " + session.getAttribute("productId") %> <br /> <br />

<%= "Product Name : " + session.getAttribute("productName") %>  <br /> <br />

<%= "Product Price : " + session.getAttribute("productPrice") %>

</body>
</html>