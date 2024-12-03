<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Ad Agency Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container my-5">
    <h1 class="text-center mb-4">Ad Agency Details</h1>
    <div class="d-flex justify-content-end mb-3">
        <form action="view" method="get">
            <input type="submit" value="Submit" class="btn btn-primary">
        </form>
    </div>
    <table class="table table-bordered table-striped table-hover">
        <thead class="table-dark">
            <tr>
                <th>SL NO</th>
                <th>Full Name</th>
                <th>Email</th>
                <th>Phone Number</th>
                <th>Company Name</th>
                <th>Product Name</th>
                <th>Description</th>
                <th>ACTION</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="dto" items="${listOfDto}">
                <tr>
                    <td>${dto.id}</td>
                    <td>${dto.name}</td>
                    <td>${dto.email}</td>
                    <td>${dto.phone}</td>
                    <td>${dto.company_name}</td>
                    <td>${dto.product_name}</td>
                    <td>${dto.description}</td>
                    <td>
                        <a href="delete?id=${dto.id}" class="btn btn-danger">Delete</a>
                        <a href="update?id=${dto.id}" class="btn btn-success">Update</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
