<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List customers</title>
</head>
<style>
	table, th, td , tr{
		border: 2px solid red;
	}
</style>
<body>
	<jsp:include page="../../index.jsp"></jsp:include>

	<h1>List all customer</h1>
	<table>
		<thead>
			<tr>
				<th>Customer Id</th>
				<th>Customer Name</th>
				<th>Customer Price</th>
				<th>Customer Description</th>
			</tr>
		</thead>
		<tbody>
			<core:forEach var="customer" items="${list}">
				<tr>
					<td>${customer.getId()}</td>
					<td>${customer.getName()}</td>
					<td>${customer.getPrice()}</td>
					<td>${customer.getDesc()}</td>
				</tr>
			</core:forEach>

		</tbody>
	</table>

</body>
</html>