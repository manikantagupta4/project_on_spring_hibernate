<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CUSTOMERS_DETAILS</title>
<style>
table {
  border="1";
  
}

th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}

tr:{background-image: url("https://drive.google.com/open?id=1SfiOADoP7ZXhKg4gizHfO9ukg6xkpywQ");}
</style>
</head>
<body>

welcome ${user.name }!!!

<br/>
<br/>

<table border="1" align="center">
		<thead>
			<tr>
				<th>customerId</th>
				<th>firstName</th>
				<th>lastName</th>
				<th>address</th>
				<th>mobile</th>
				<th>email</th>
				<th>salary</th>
				<th>dateOfBirth</th>
				<th>update</th>
				<th>delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${customers}" var="customer">
				<tr>
					<td>${customer.customerId}</td>
					<td>${customer.firstName }</td>
					<td>${customer.lastName}</td>
					<td>${customer.address }</td>
					<td>${customer.mobile }</td>
					<td>${customer.email }</td>
					<td>${customer.salary }</td>
					<td><fmt:formatDate value="${customer.dateOfBirth }" pattern="dd/MM/yyyy"/></td>
						<c:if test="${user.profile == 'admin'}">
							<td><a href="update?id=${customer.customerId}">update</a></td>
							<td><a href="delete?id=${customer.customerId}">delete</a></td>
						</c:if>
					

				</tr>
			</c:forEach>
		</tbody>
	</table>

<table align="center">
<tr>
<td align="center">
<c:if test="${user.profile == 'admin' || user.profile == 'mgr'}">
		<a href="addcustomer"><input type="submit" value="addcustomer"></a>
	</c:if>
</td>
<td><a href="logout"><input type="submit" value="logout"></a></td>
</tr>
</table>
	
</body>
</html>