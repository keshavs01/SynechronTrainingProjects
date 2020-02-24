<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/styles.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>


<title>Sai Travel</title>
</head>
<body>
<%-- <jsp:include main.jsp/> --%>
	<h1 class="centerText blue">${mainHeading}</h1>

	<ul>
		<li><a href="addHotel">Add Hotel</a></li>
		<!-- 	<li><a href="viewtrip">View Trips</a></li> -->
		<li><a href="viewHotel">View Hotel</a></li>
		<li><a href="addTrip">Add Trip</a></li>
	</ul>
</body>
</html>