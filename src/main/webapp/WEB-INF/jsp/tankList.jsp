<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TankList</title>
</head>
<body>
<table>
<tr>
<th>Tier</th>
<th>Type</th>
<th>Name</th>
<th>HitPoints</th>
</tr>
<c:forEach var="tank" items="${tanks}" >
	<tr>
	<td>${tank.tier}</td>
	<td>${tank.type}</td>
	<td>${tank.name}</td>
	<td>${tank.hitPoints}</td>
	</tr>
   
</c:forEach>

</table>

</body>
</html>