<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script 
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Trip Details</title>
</head>
<body>
	<div class="container justify-content-md-center">
		<form:form method="post" action="addtrip">

			<div class="form-group">
				<label>Tour Id</label>
				<form:input class="form-control" placeholder="Enter Tour Id"
					path="tourId" />
				<span class="text-danger"> <form:errors path="tourId"></form:errors>
				</span>
			</div>

			<div class="form-group">
				<label>Tour Name</label>
				<form:input class="form-control" placeholder="Enter Tour Name"
					path="tourName" />
				<span class="text-danger"> <form:errors path="tourName"></form:errors>
				</span>
			</div>
			<div class="form-group">
				<label>Tour Price</label>
				<form:input class="form-control" placeholder="Enter Price"
					path="price" />
			</div>
			<div class="form-group">
				<label>Tour Duration</label>
				<form:input class="form-control" placeholder="Enter Duration"
					path="duration" />
			</div>
			<input type="submit" value="Add" class="btn btn-primary">
		</form:form>

	</div>
</body>
</html>