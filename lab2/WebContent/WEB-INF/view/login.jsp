<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
</head>
<body>
	<h2>Login Page</h2>
	<form action="login">
		UserName : <input type="text" name="username" /> <br>
		Password : <input type="text" name="password" /> 
		<input type="submit" name="submit">
	</form>
</body>
</html>