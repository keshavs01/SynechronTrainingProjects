<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Add Hotel Details</title>
</head>
<body>

	<div class="container justify-content-md-center">
		<form:form method="post" action="addHotel">

			<div class="form-group">
				<label>Hotel Code</label>
				<form:input type="number"  class="form-control" placeholder="Enter Hotel code"
					path="hotelCode" />
				<span class="text-danger"> <form:errors path="hotelCode"></form:errors>
				</span>
			</div>

			<div class="form-group">
				<label>Hotel Name</label>
				<form:input class="form-control" placeholder="Enter Hotel Name"
					path="hotelName" />
				<span class="text-danger"> <form:errors path="hotelName"></form:errors>
				</span>
			</div>
			<div class="form-group">
				<label>Image File</label>
				<form:input class="form-control" placeholder="Emage File"
					path="image" />
			</div>
			<input type="submit" value="Add" class="btn btn-primary">
		</form:form>

	</div>
</body>
</html>