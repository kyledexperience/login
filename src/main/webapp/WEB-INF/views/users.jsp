<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/litera/bootstrap.min.css"/>
<link rel="stylesheet" href="/style.css" />
</head>
<body>

<div class="container">

	<a href="/">Home</a>

	<h1 class="display-2">Users Galore</h1>

	<table class="table">
		<tr>
			<th>Name</th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach var="p" items="${list}">
			<tr>
				<td>${p.username}</td>
				<td>
				<a href="/edit/${p.id}">Edit</a>
				</td>
				<td>
				<a href="/delete/${p.id}">Delete</a>
				</td>
				
			</tr>
		</c:forEach>

	</table>
</div>

</body>
</html>