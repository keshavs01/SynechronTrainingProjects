<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome ${sessionScope.loggedUser.userName}</h2>
	<h1>${fullname}</h1>
	<ul>
		<li><a href="addUpdateTrip">Add Trip</a></li>

		<li><a href="viewTrips">View Trips</a></li>
		
		<li><a href="viewDrivers">View Drivers</a></li>
		
		<li><a href="viewCars">View Cars</a></li>


		<c:set var="hidden" value="${sessionScope.loggedUser.isAdmin}" />
		<c:choose>
			<c:when test="${ sessionScope.loggedUser.isAdmin}">
				<li><a href="addUpdateDriver">Add Driver</a></li>
				<li><a href="addUpdateCar">Add Cars</a></li>
			</c:when>
			<c:when test="${not sessionScope.loggedUser.isAdmin}">
<!-- 				</br> -->
<!-- 				<input value="asdf"> TIME isNotAdmin</input> -->
			</c:when>
		</c:choose>
	</ul>

</body>
</html>