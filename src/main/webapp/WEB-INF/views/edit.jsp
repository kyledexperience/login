<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/litera/bootstrap.min.css" />
<link rel="stylesheet" href="/style.css" />
</head>
<body>

	<div class="container">

		<h3 class="display-2">Update</h3>


		<form action="/update">
			<input type="hidden" name="id" value="${user.id}" />Username <input
				type="text" name="username" value="${user.username}" /><br>Password <input
				type="text" name="password" value="${user.password}" /><br>First <input
				type="text" name="firstName" value="${user.firstName}" /><br>Last <input
				type="text" name="lastName" value="${user.lastName}" /><br>
			<button type="submit" class="btn btn-dark">Update</button>

		</form>



	</div>

</body>
</html>