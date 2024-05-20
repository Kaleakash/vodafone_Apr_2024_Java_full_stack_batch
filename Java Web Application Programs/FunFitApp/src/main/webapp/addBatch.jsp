<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Batch Details</h2>
<form action="BatchController" method="post">
<label>TypeOfBatch</label>
<select name="typeofbatch">
<option value="">--Select Batch--</option>
<option value="Morning">Morning</option>
<option value="Evening">Evening</option>
</select>
<br/>
<label>Time</label>
<select name="time">
<option value="">--Time--</option>
<%
for(int i=1,j=2;i<=12 && j<13;i++,j++){
	%>
	<option value="<%=i%>-<%=j %>"><%=i%>-<%=j%></option>
	<% 
}
%>
</select>
<br/>
<input type="submit" value="Add Batch"/>
<input type="reset" value="reset"/>
</form>
</body>
</html>