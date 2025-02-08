<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="submit" method="post">
<input type="text" name="name" placeholder="enter name">
<input type="tel" name="contact" placeholder="enter contact">
<input type="text" name="email" placeholder="enter role">
<input type="text" name="role" placeholder="enter role">
<input type="number" name="pay" placeholder="enter pay">
<input type="submit" value="submit">
<button><a href="view.jsp">View</a></button>
<button><a href="search.jsp">Search</a></button>
</form>
${violation}
</body>
</html>