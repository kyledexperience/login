<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users</title>
</head>
<body>

	<h1>Users Galore</h1>

	<table>
		<tr>
			<th>Name</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<c:forEach var="p" items="${list}">

		<tr>
		<td>${p.name}</td>
		</tr>


		</c:forEach>

	</table>
	
	<a href="/">Home</a>


</body>
</html>