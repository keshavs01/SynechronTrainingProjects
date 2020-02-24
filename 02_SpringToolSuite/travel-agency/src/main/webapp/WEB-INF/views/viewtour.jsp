<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Tour ID</th>
				<th scope="col">Tour Name</th>
				<th scope="col">Duration</th>
				<th scope="col">Price</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${tourList}" var="item">
				<tr>
					<td><c:out value="${item.tourId}"/></td>
					<td><c:out value="${item.tourName}"/></td>
					<td><c:out value="${item.duration}"/></td>
					<td><c:out value="${item.price} "/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>