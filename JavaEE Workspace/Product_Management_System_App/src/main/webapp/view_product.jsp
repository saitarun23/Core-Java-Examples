<%@page import="java.util.Iterator"%>
<%@page import="com.pms.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>View Product</h2>

<table border="2">
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