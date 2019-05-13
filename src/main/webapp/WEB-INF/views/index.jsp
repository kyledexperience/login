<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/litera/bootstrap.min.css" />
<link rel="stylesheet" href="style.css" />
</head>
<body>
	<div class="container">

		<h3 class="display-3">Returning Users</h3>
		<form action="/landing">

			<input type="text" name="username" placeholder="Username" /> <input
				type="text" placeholder="Password" />

			<button class="btn btn-light" type="submit">Login</button>
		</form>

	</div>
	<div class="container">
		<h3 class="display-3">New User</h3>
		<form action="/create">

			<input type="text" name="firstName" placeholder="First" /> <input
				type="text" name="lastName" placeholder="Last" /> <br> <input
				type="text" name="username" placeholder="Username" /> <input
				type="text" name="password" placeholder="Password" />

			<button class="btn btn-light" type="submit">Sign Up</button>
		</form>


		<a href="/users">View Users</a>
	</div>


</body>
</html>