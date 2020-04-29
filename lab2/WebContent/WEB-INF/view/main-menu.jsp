<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Trainee Management System</h2>

	<table boder="1">
		<tr>
			<th>Pick your operation</th>
		</tr>
		<tr>
			<td><input type="button" value="Add a Trainee"
				onclick="window.location.href='showFormForAdd';return false;" /></td>
		</tr>
		<tr>
			<td><input type="button" value="Delete a Trainee"
				onclick="window.location.href='delete-ops';return false;" /></td>
		</tr>
		<tr>
			<td><input type="button" value="Modify a Trainee"
				onclick="window.location.href='modify-ops';return false;" /></td>
		</tr>
		<tr>
			<td><input type="button" value="Retrieve a Trainee"
				onclick="window.location.href='retrieve-ops';return false;" /></td>
		</tr>
		<tr>
			<td><input type="button" value="Retrieve all Trainee"
				onclick="window.location.href='allDetails';return false;" /></td>
		</tr>

	</table>
</body>
</html>