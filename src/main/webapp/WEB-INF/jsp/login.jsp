<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body class="light-color">

<div class="container">

		<div class="row top-div"></div>

		<div class="row">
			<div class="row dark-color" style="color: #edf2f4;">
				<div class="col-md-3"></div>
				<div class="col-md-6">
					<h1 class="margin-only-top-10vh" style="margin: 2vh auto; text-align:center;">Login</h1>
				</div>
				<div class="col-md-3"></div>
			</div>
			<div class="row medium-color" style="height: 36vh;">
				<div class="col-md-3"></div>
				<div class="col-md-6">
					<form action="${pageContext.request.contextPath}/login" method="POST">
							<c:if test="${param.error != null}">
								<div class="row" style="margin-top:2vh;">
									Error
								</div>
							</c:if>
							<div class="row" style="margin-top:2vh;">
								<div class="col-md-6" style="text-align:right;"><label for="username">UserName</label> </div>
								<div class="col-md-6" style="text-align:left;"><input size="16" type="text" id="username" name="username"></div>
							</div>
							<div class="row" style="margin-top:2vh;">
								<div class="col-md-6" style="text-align:right;"><label for="password">Enter password</label> </div>
								<div class="col-md-6" style="text-align:left;"><input size="16" type="password" id="password" name="password"></div>
							</div>
							<div class="row" style="margin: 2vh 4vw"><input type="submit" value="Login"></div>
					</form>
				</div>
				<div class="col-md-3"></div>
			</div>
		</div>
		<div class="row"></div>
	</div>
</body>
</html>