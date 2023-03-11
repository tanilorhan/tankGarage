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
					<sform:form method="POST" modelAttribute="tankFilterParameter">
						<div class="container" style="margin: 2vh auto;">

							<div class="row">

								<div class="col py-3 mx-3">
									<div class="row">
										<sform:label path="name">Name</sform:label>
									</div>
									<div class="row">
										<sform:input path="name"></sform:input>
									</div>
								</div>

								<div class="col py-3 mx-3">
									<div class="row">
										<sform:label path="tiers">Tier</sform:label>
									</div>
									<div class="row">
										<sform:select path="tiers" multiple="true">
											<c:forEach items="${tiers}" var="tier">
												<option label="Tier ${tier}" value="${tier}"></option>
											</c:forEach>
										</sform:select>
									</div>
								</div>

								<div class="col py-3  mx-3">
									<div class="row">
										<sform:label path="tankClasses">Class</sform:label>
									</div>
									<div class="row">
										<sform:select path="tankClasses" multiple="true">
											<c:forEach items="${tankClasses}" var="tankClass">
												<option label="${tankClass.name}" value="${tankClass.id}"></option>
											</c:forEach>
										</sform:select>
									</div>
								</div>

							</div>
							<div class="row mx-1">
								<input type="submit" value="Search" />
							</div>
						</div>

					</sform:form>
				</div>
				<div class="col-md-3"></div>
			</div>
			<div class="row medium-color" style="padding: 2vh 0;" >
				<div class="col-md-3"></div>
				<div class="col-md-6"><button onclick="window.location.href='${pageContext.request.contextPath}/tank/add';" type="button" class="btn light-text-color dark-color" style="margin-left: auto; margin-right: auto; width:100%">Add a New Tank</button></div>
				<div class="col-md-3"></div>
			</div>
			<div class="row medium-color" style="height: 70vh;">
				<div class="col-md-3"></div>
				<div class="col-md-6">
					<div style=" border-style:solid; border-width: 5px 20px; border-color:#4f772d; margin-left:0px; margin-right:0px;">
					<table style="margin: 0px auto;">
						<tr>
							<th class="margin-padding-0"><div class="table-text">Tier</div></th>
							<th class="margin-padding-0"><div class="table-text">Type</div></th>
							<th class="margin-padding-0"><div class="table-text">Name</div></th>
							<th class="margin-padding-0"><div class="table-text">HitPoints</div></th>
						</tr>
						<c:forEach var="tank" items="${tanks}">
							<tr>
								<td class="margin-padding-0"><div class="table-text">${tank.tier}</div></td>
								<td class="margin-padding-0"><div class="table-text">${tank.tankClass.name}</div></td>
								<td class="margin-padding-0"><div class="table-text">${tank.name}</div></td>
								<td class="margin-padding-0"><div class="table-text">${tank.hitPoints}</div></td>
							</tr>
						</c:forEach>

					</table>
					</div>
				</div>
				<div class="col-md-3"></div>
			</div>
		</div>

		<div class="row"></div>
	</div>




	

</body>
</html>