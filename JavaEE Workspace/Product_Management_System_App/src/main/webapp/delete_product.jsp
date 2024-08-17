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
<h2>Delete Product</h2>

<form action="ProductDeleteController" method="post">
	<label>PId</label>
	<input type="number" name="pid"/><br/>
	
	<input type="submit" value="Delete Product"/>
	<input type="reset" value="reset"/>
</form>

<a href="index.html">Back</a>
</body>
</html>