<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD CUSTOMER</title>
</head>
<style type="text/css">
	.error{
		color: red;
		font-family: serif;
		font-style: italic;
	}
	
</style>
</head>
<body>
<form:form action="addcustomer" method="post" modelAttribute="customer">
	<form:hidden path="customerId"/>
	<table align="center">
	<tr>
	<td>Enter firstName:</td>
	<td><form:input path="firstName"/><form:errors path="firstName" class="error"/></td>
	</tr>
	<tr>
	<td>Enter lastName: </td>
	<td><form:input path="lastName"/><form:errors path="lastName" class="error"/></td>
	</tr>
	<tr>
	<td>Enter address: </td>
	<td><form:input path="address"/><form:errors path="address" class="error"/></td>
	</tr>
	<tr>
	<td>Enter mobile: </td>
	<td><form:input path="mobile"/><form:errors path="mobile" class="error"/></td>
	</tr>
	<tr>
	<td>Enter email: </td>
	<td><form:input path="email"/><form:errors path="email" class="error"/></td>
	</tr>
	<tr>
	<td>Enter salary: </td>
	<td><form:input path="salary"/><form:errors path="salary" class="error"/></td>
	</tr>
	<tr>
	<td>Enter dateOfBirth: </td>
	<td><form:input path="dateOfBirth"/><form:errors path="dateOfBirth" class="error"/></td>
	</tr>
	<tr>
	<td><input type="submit"/></td>
	</tr>
	</table>
	
</form:form>
</body>
</html>