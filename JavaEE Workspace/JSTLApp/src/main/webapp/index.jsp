<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!int a, b,sum; %>
<%
a=10;
b=20;
sum =a+b;
out.println("Sum of two number is "+sum);
%>
<br/>
<p>Sum of two number is <%=10+20 %></p>
<h3>EL : Expression Language</h3>
<p>Sum of two number is ${10+20}</p>
<p>Sub of two number is ${10-20}</p>
<p>mul of two number is ${10*20}</p>
<p>div of two number is ${10/20}</p>
<p>mod of two number is ${10%20}</p>
<p>eq of two number is ${10==20}</p>
<p>gt of two number is ${10>20}</p>

<hr/>
<h3>JSTL Example</h3>
<core:out value="Welcome to JSTL"></core:out>
<br/>
<core:set var="name" value="Steven"></core:set>
<br/>
<core:out value="${name}"></core:out>
</body>
</html>