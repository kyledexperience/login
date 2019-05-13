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

	<h1>Users Galore</h1>
	
	<c:forEach var="p" items="${list}">
	
	<p>${p}</p>
	
	</c:forEach>


</div>
</body>
</html>