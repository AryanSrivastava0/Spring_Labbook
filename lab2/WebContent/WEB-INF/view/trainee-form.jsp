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
	<h2>Enter Trainee Details</h2>
	<form:form action="saveTrainee" modelAttribute="trainee" method="POST">
		<table>
			<tbody>
				<tr>
					<td><label>Trainee Id</label></td>
					<td><form:input path="traineeId" /></td>
				</tr>
				<tr>
					<td><label>Trainee Name</label></td>
					<td><form:input path="traineeName" /></td>
				</tr>
				<tr>
					<td><label>Trainee location</label></td>
					<td><form:checkbox path="traineeLocation" value="Chennai" />Chennai
						<form:checkbox path="traineeLocation" value="Bangalore" />Bangalore
						<form:checkbox path="traineeLocation" value="Pune" />Pune <form:checkbox
							path="traineeLocation" value="Mumbai" />Mumbai</td>
				</tr>
				<tr>
					<td><label>Trainee Domain</label></td>
					<td><form:select path="traineeDomain">
							<form:option value="JEE" label="JEE" />
							<form:option value=".NET" label=".NET" />
							<form:option value="Mainframe" label="Mainframe" />
						</form:select></td>
				</tr>
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Add Trainee" /></td>
				</tr>
			</tbody>
		</table>

	</form:form>

</body>
</html>