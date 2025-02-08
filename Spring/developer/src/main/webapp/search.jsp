<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Page</title>
</head>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<body>
	<form action="search" method="get">

		<input type="search" placeholder="Search by developer name"
			name="developerName"> <input type="submit" value="Search">
	</form>
	${update}
	<div>
		<table class="table-primary border border-3">
			<tr>
				<th>Id</th>
				<th>Developer Name</th>
				<th>Developer Contact</th>
				<th>Developer Email</th>
				<th>Developer Role</th>
				<th>Developer Pay</th>
				<th>Action</th>
			</tr>
			<tbody>
				<c:forEach var="l" items="${list}">
					<tr>
						<td>${l.id}</td>
						<td>${l.name}</td>
						<td>${l.contact}</td>
						<td>${l.email}</td>
						<td>${l.role}</td>
						<td>${l.pay}</td>
						<td><a href="update?id=${l.id}">update</a></td>
						<td><a href="delete?id=${l.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>


</body>
</html>