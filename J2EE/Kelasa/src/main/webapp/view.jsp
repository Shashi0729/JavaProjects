<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border: 1px solid;
	tr: nth-child(even){background-color: #f2f2f2;
}

}
th {
	background-color: #04AA6D;
	color: white;
	border: 1px solid;
	border-color: black;
}

td {
	padding: 15px;
	text-align: left;
	border: 1px solid;
}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<form action="view" method="get">
		<input type="submit" name="submit" value="submit">

		<table align="center">
			<tr>
				<th>Id</th>
				<th>FullName</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Location</th>
				<th>Job title</th>
				<th>Job type</th>
				<th>Salary</th>
				<th>Skills</th>
				<th>Action</th>
			<tbody>
				<c:forEach var="dto" items="${listOfValue}">
					<tr>
						<td>${dto.id}</td>
						<td>${dto.fullname}</td>
						<td>${dto.email}</td>
						<td>${dto.phone}</td>
						<td>${dto.location}</td>
						<td>${dto.jobtitle}</td>
						<td>${dto.jobtype}</td>
						<td>${dto.salaryexpectation}</td>
						<td>${dto.skills}</td>
						<td> 
						<a href="delete?id=${dto.id}"><input type="button" class="btn btn-danger" value="delete"></a>
						<a href="update?id=${dto.id}"><input type="button" class="btn btn-primary" value="update"></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>

</body>
</html>