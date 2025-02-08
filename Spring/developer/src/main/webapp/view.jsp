<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<style>
thead,tbody,tr,th{
 border :solid 2px;
}
tbody,td{
border : solid 1px;
}
</style>
<body>
<form action="view" method = "get">
   <a href="index.jsp" class = "btn btn-success">Home</a>
    <input type = "submit" value = "submit">
<table align = "center">
<thead>
<tr>
<th>Developer Name</th>
<th>Developer Number</th>
<th>Email</th>
<th>Role</th>
<th>Pay</th>


</tr>
</thead>
<tbody>
 <c:forEach var="save" items="${view}">
<tr>
<td>${save.name}</td>
<td>${save.contact}</td>
<td>${save.email}</td>
<td>${save.role}</td>
<td>${save.pay}</td>

 
</tr>
</c:forEach>
</tbody>
</table>
</form>
</body>
</html>