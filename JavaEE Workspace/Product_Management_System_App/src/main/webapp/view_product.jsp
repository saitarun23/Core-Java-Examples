<%@page import="java.util.Iterator"%>
<%@page import="com.pms.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<h2>View Product</h2>

<table border="2" class="table">
	<tr>
		<th>PId</th>
		<th>PName</th>
		<th>Price</th>
	</tr>
	<%
	Object obj = request.getAttribute("listofproduct");
	List<Product> listOfProduct = (List<Product>)obj;			// type casting for that type of object. 
	Iterator<Product> li = listOfProduct.iterator();
			while(li.hasNext()){
				Product p = li.next();
				%>
				<tr>
					<td> <%=p.getPid() %> </td>
					<td> <%=p.getPname() %> </td>
					<td> <%=p.getPrice() %> </td>
				</tr>
				<%
			}
	%>
</table>

<a href="index.html">Back</a>
</body>
</html>