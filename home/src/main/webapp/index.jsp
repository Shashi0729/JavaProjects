<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<form>
<h4>User name</h4>
<input type="text" name="name">
<h4>DoB</h4>
<input type="date" name="date" >
<h4>State</h4>
<select name="myList" >
<option value="value1">Karnataka</option>
<option value="value2">Andrapradesh</option>
<option value="value3">Kerala</option>
</select>

<h4>Language</h4>
<input type="checkbox" name="lang">Kannada
<input type="checkbox" name="lang">Hindi
<input type="checkbox" name="lang">English
<h4>Gender</h4>
<input type="radio" name="gender">Male
<input type="radio" name="gender">Female
<br>
<input type="button" value="submit" name="submit">
</form>


</body>
</html>