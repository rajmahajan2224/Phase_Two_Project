<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products Details</title>
</head>
<body>

<h1 style = "text-align: center; color: green;">Enter Product Details</h1>
<hr />

<form action = "prodetails">
<label>Product Id:</label><br />
<input type = "text" name = "productId" placeholder = "Enter Product Id"><br /><br />
<label>Product Name:</label><br />
<input type = "text" name = "productName" placeholder = "Enter Product Name"><br /><br />
<label>Product Price:</label><br />
<input type = "text" name = "productPrice" placeholder = "Enter Product Price"><br /><br />
<input type = "submit" value = "Check">
</form>

</body>
</html>