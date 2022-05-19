<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Customer</title>
</head>
<body>

	<jsp:include page="../../index.jsp"></jsp:include>
	<div align="center" style="border: 2px solid green; padding: 10px;">
		<h1>Update Customer</h1>
		<form:form action="update-customer" method="post" modelAttribute="customer">
			<table border="0">
				<tr>
					<td>Customer Id:</td>
					<td><form:input path="id" /></td>
				</tr>
				<tr>
					<td>Customer Name:</td>
					<td><form:input path="name" /></td>
				</tr>

				<tr>
					<td>Customer Balance:</td>
					<td><form:input path="balance" /></td>
				</tr>

				<tr>
					<td>Customer Address:</td>
					<td><form:textarea path="address" /></td>
				</tr>

				<tr>
					<td>Submit</td>
					<td><input type="submit" value="Update Customer" /></td>
				</tr>

			</table>

		</form:form>
	</div>
</body>
</html>