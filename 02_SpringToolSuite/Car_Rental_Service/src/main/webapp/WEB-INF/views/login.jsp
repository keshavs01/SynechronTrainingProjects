<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- form card login with validation feedback -->
	<div class="card card-outline-secondary">
		<div class="card-header">
			<h3 class="mb-0">Login</h3>
		</div>
		<div class="card-body">
			<form:form class="form" role="form" action="login" autocomplete="off" id="loginForm"
				novalidate="" method="POST">
				<div class="form-group">
					<label for="uname1">Username</label> 
					<form:input type="text"	class="form-control" path="loginId"/>
					<div class="invalid-feedback">Please enter your username or
						email</div>
				</div>
				<div class="form-group">
					<label>Password</label> 
					<form:input type="password" class="form-control" path="password" autocomplete="new-password"/>
					<div class="invalid-feedback">Please enter a password</div>
				</div>
				<button type="submit" class="btn btn-success btn-lg float-right"
					id="btnLogin">Login</button>
			</form:form>
		</div>
		<!--/card-body-->
	</div>
	<!-- /form card login -->

</body>
</html>