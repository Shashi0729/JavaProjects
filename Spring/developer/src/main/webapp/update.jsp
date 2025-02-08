<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
<input type="hidden" name="id" value="${update.id}">
<input type="text" name="name" placeholder="enter name" value="${update.name}">
<input type="tel" name="contact" placeholder="enter contact" value="${update.contact}">
<input type="text" name="email" placeholder="enter role" value="${update.email}">
<input type="text" name="role" placeholder="enter role" value="${update.role}">
<input type="number" name="pay" placeholder="enter pay" value="${update.pay}">
<input type="submit" value="Update">
</form>
</body>
</html>