<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Trainee Details</h2>
	<table border="1">
		<tr>
			<th>Trainee ID</th>
			<th>Trainee Name</th>
			<th>Trainee location</th>
			<th>Trainee Domain</th>
		</tr>
		<c:forEach var="tempTrainee" items="${trainees}">
			<tr>
				<th>${tempTrainee.traineeId}</th>
				<th>${tempTrainee.traineeName}</th>
				<th>${tempTrainee.traineeLocation}</th>
				<th>${tempTrainee.traineeDomain}</th>
			</tr>
		</c:forEach>
	</table>
    </html>