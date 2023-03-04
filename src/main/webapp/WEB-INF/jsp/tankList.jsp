<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TankList</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>
	<sform:form method="POST" modelAttribute="tankFilterParameter">
		<div class="container">
			<div class="row">
				<div class="col">
					<sform:select path="tier">
						<c:forEach items="${tiers}" var="tier">
							<option label="Tier ${tier}" value="${tier}"></option>
						</c:forEach>

					</sform:select>
				</div>
				<div class="col"></div>
				<div class="col"></div>
			</div>
			<div class="row"><input type="submit" value="Search"/></div>
		</div>

	</sform:form>
	<table>
		<tr>
			<th>Tier</th>
			<th>Type</th>
			<th>Name</th>
			<th>HitPoints</th>
		</tr>
		<c:forEach var="tank" items="${tanks}">
			<tr>
				<td>${tank.tier}</td>
				<td>${tank.tankClass.name}</td>
				<td>${tank.name}</td>
				<td>${tank.hitPoints}</td>
			</tr>
		</c:forEach>
		
	</table>
	
	<button
			onclick="window.location.href='${pageContext.request.contextPath}/tank/add';"
			type="button" class="btn btn-primary">Add a New Tank</button>

</body>
</html>