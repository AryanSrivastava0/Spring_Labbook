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
	<table border="1">
		<tr>
			<td><label>Trainee Id</label></td>
			<td>"${ReTrainee.traineeId}"/></td>
		</tr>
		<tr>
			<td><label>Trainee Name</label></td>
			<td>"${ReTrainee.traineeName}"/></td>
		</tr>
		<tr>
			<td><label>Trainee Location</label></td>
			<td>"${ReTrainee.traineeLocation}"/></td>
		</tr>
		<tr>
			<td><label>Trainee Domain</label></td>
			<td>"${ReTrainee.traineeDomain}"/></td>
		</tr>

	</table>

</body>
</html>