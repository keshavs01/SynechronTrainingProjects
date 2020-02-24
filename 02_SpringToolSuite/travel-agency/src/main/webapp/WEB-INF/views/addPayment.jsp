
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<html>

<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css "
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
  <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Payment Details</title>

</head>
<body>


	<!-- form user info -->
	<div class="card card-outline-secondary">
		<div class="card-header">
			<h3 class="mb-0">Add Payment Information</h3>
		</div>
		<div class="card-body">
			<form:form method="post" action="addPayment" class="form">
				<div class="form-group row">
					<label class="col-lg-3 col-form-label form-control-label">User ID/Username</label>
					<div class="col-lg-9">
						<form:input class="form-control" type="text" placeholder="Enter UNIQUE User ID/ Username" path="customerId"/>
					</div>
					<span class="text-danger"> <form:errors path="customerId"></form:errors>
				</span>
				</div>
<!-- 				<div class="form-group row"> -->
<!-- 					<label class="col-lg-3 col-form-label form-control-label">User Full Name</label> -->
<!-- 					<div class="col-lg-9"> -->
<!-- 						<imput class="form-control" type="text"  placeholder="Enter first and last name" /> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 				<div class="form-group row"> -->
<!-- 					<label class="col-lg-3 col-form-label form-control-label">Payment Date</label> -->
<!-- 							<div class="container"> -->
<!-- 							    <div class="col-xs-8 correct_space" style="margin-left: 10px;"> -->
<!-- 							        <div class="input-group date" data-provide="datepicker"> -->
<!-- 							            <input class="form-control" id="wodate1" name="date" placeholder="MM.YYYY" value="" bootstrap-datepicker="" data-date-end-date="0d"> -->
<!-- 							            <div class="input-group-addon"> -->
<!-- 							                <i class="fa fa-calendar"></i> -->
<!-- 							            </div> -->
<!-- 							        </div> -->
<!-- 							    </div> -->
<!-- 							</div> -->
<!-- 				</div> -->

				<div class="form-group row">
                            <label class="col-lg-3 col-form-label form-control-label">Payment Mode</label>
                            <div class="col-lg-9">
                             
                             
                            
                                <div class="form-check form-check-inline col-lg-3">
                                	<form:radiobutton  path="paymentMode" />Cash
<!--                                     <label class="form-check-label"> -->
<!--                                         <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> Cash -->
<!--                                     </label> -->
                                </div>
                                <div class="form-check form-check-inline">
                                	<form:radiobutton path="paymentMode" />Cheque
<!--                                     <label class="form-check-label"> -->
<!--                                         <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> Cheque -->
<!--                                     </label> -->
                                </div>
                            </div>
                        </div>


				<div class="form-group row">
					<label class="col-lg-3 col-form-label form-control-label">Password</label>
					<div class="col-lg-9">
						<input class="form-control" type="password" placeholder="Enter Password" >
					</div>
				</div>
				<div class="form-group row">
					<label class="col-lg-3 col-form-label form-control-label">Confirm</label>
					<div class="col-lg-9">
						<input class="form-control" type="password" placeholder="Confirm Password">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-lg-3 col-form-label form-control-label">Payment Amount</label>
					<div class="col-lg-9">
						<form:input class="form-control" type="number"  placeholder="Enter Amount"  path="amount"/>
					</div>
					<span class="text-danger"> <form:errors path="amount"></form:errors>
				</span>
				</div>
				<div class="form-group row">
					<label class="col-lg-3 col-form-label form-control-label"></label>
					<div class="col-lg-9">
						<input type="reset" class="btn btn-secondary" value="Cancel">
						<input type="submit" class="btn btn-primary"  value="Save Changes">
					</div>
				</div>
			</form:form>
		</div>
	</div>
	<!-- /form user info -->





</body>
</html>