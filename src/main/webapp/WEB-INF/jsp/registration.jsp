<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<h1>Register</h1>
<form action="${pageContext.request.contextPath}/registration" method="POST">
	<label for="userName">UserName</label>
	<input type="text" id="userName" name="userName"><br>
	
	<label for="password">Enter password</label>
	<input type="password" id="password" name="password"><br>
	
	<label for="passwordConfirm">Reenter password</label>
	<input type="password" id="passwordConfirm" name="passwordConfirm"><br>
	
	<input type="submit" value="Submit">

</form>

</body>
</html>