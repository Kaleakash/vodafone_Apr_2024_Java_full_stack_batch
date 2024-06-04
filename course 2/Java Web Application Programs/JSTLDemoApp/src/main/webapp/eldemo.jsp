<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int a,b,sum; %>
<%
a=10;
b=20;
sum = a+b;
out.println("Sum of two number is "+sum);
%>
<br/>
<p>Sum of two number is <%=sum %></p>
<p>Sum of two number is <%=10+20 %><p>
<p>Sum of two number is ${100+200} </p>
<p>sub of two number is ${100-200} </p>
<p>mul of two number is ${100*200} </p>
<p>div of two number is ${100/200} </p>
<p>gt of two number is ${100 > 200} </p>
<p>lt of two number is ${100 < 200} </p>
<p>eq of two number is ${100 == 200} </p>
<p>nq of two number is ${100!=200} </p>
<p>Sum of two number is ${100 div 200} </p>


</body>
</html>