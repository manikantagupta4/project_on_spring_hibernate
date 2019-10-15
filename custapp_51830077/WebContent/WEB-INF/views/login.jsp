<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE</title>
<style type="text/css">
.error{
 color: red;
 font-family: sans-serif;
 font-style: italic;
}
h1{
color: blue;
}
</style>
</head>
<body>
<h1 align="center">WELCOME TO CUSTOMER APPLICATION</h1>
<table align="right">
<tr>
		<td >${error }</td>
		<td >${message }</td>
	</tr>
	</table>
<br/>
<br/>
<form:form action="login" method="post" modelAttribute="userbean">
	<table align="center">
	<tr>
		<td >Enter email</td>
		<td ><form:input path="email"/><form:errors path="email" class="error"/></td>
	</tr>
	<tr>
		<td>Enter password</td>
		<td ><form:password path="password"  /><form:errors path="password" class="error"/></td>
	</tr>
	<tr>
		<td ><input type="submit"/></td>
	</tr>
</table>
	
</form:form>
</body>
</html>