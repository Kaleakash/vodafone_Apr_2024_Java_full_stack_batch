<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Failure try once again! ${requestScope.msg} ${sessionScope.msg1}</h2>
<%@include file="login.jsp" %>
<%
//response.sendRedirect("hello");
%>
</body>
</html>