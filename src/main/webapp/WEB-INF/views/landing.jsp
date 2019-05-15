<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hooray</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/litera/bootstrap.min.css" />
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<div>

		<%@include file="partials/header.jsp"%>

		<p>${message }</p>
		<h1>Oh, Hello ${user.firstName}!</h1>

		<img
			src="https://live.staticflickr.com/7077/7188563020_f44054babe_b.jpg" />


	</div>
</body>
</html>