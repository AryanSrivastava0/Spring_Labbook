<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Update Trainee</h2>
	<form:form action="updateTrainee" modelAttribute="updateTrainee"
		method="POST">
		<table border="1">
			<tr>
				<td><label>Trainee Id</label></td>
				<td><form:input path="traineeId"
						placeholder="${updateTrainee.traineeId}" /></td>
			</tr>
			<tr>
				<td><label>Trainee Name</label></td>
				<td><form:input path="traineeName"
						placeholder="${updateTrainee.traineeName}" /></td>
			</tr>
			<tr>
				<td><label>Trainee Location</label></td>
				<td><form:input path="traineeLocation"
						placeholder="${updateTrainee.traineeLocation}" /></td>
			</tr>
			<tr>
				<td><label>Trainee Domain</label></td>
				<td><form:input path="traineeDomain"
						placeholder="${updateTrainee.traineeDomain}" /></td>
			</tr>
			<tr>
				<td><label></label></td>
				<td><input type="submit" value="Update Trainee" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>