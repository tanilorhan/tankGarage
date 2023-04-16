<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login</h1>
<c:if test="${param.error != null}">
     Error
</c:if>
<form action="${pageContext.request.contextPath}/login" method="POST">
	<label for="username">UserName</label>
	<input type="text" id="username" name="username"><br>
	
	<label for="password">Enter password</label>
	<input type="password" id="password" name="password"><br>
		
	<input type="submit" value="Login">

</form>

</body>
</html>