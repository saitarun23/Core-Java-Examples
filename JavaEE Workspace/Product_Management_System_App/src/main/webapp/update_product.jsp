<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h2>Update Product</h2>

<form action="ProductUpdateController" method="post">
	<label>PId</label>
	<input type="number" name="pid"/><br/>
	<label>Price</label>
	<input type="number" name="price"/><br/>
	<input type="submit" value="Update Product"/>
	<input type="reset" value="reset"/>
</form>

<a href="index.html">Back</a>
</body>
</html>