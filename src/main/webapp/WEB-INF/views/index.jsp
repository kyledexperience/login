<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="style.css"/>
</head>
<body>
<div>

	<h3>Returning Users</h3>
	<form action="/landing">
	
	<input type="text" name="name" placeholder="Username"/>
	<input type="text" placeholder="Password"/>
	
	<button type="submit">Login</button>
	</form>
	
	<a href="/users">View Users</a>


</div>
</body>
</html>