<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="topHtml.jsp"></jsp:include>
<div class="page-container">
	<!-- MAIN CONTENT-->
	<div class="main-content">
		<div class="section__content section__content--p30">
			<div class="container-fluid">
				<div class="card">
					<div class="card-header">
						<strong>Alter Trip</strong>${command}
					</div>
					<div class="card-body card-block">
					
					
						<form:form action="addUpdateTrip" method="post"
							enctype="multipart/form-data" class="form-horizontal">
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Trip
										ID</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input path="tripId" readonly="${isEdit}" type="number"
										placeholder="Enter Trip ID" class="form-control" />
									<small class="form-text text-muted"></small>
								</div>
							</div>
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Trip Origin</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input path="tripOrigin" type="text" placeholder="Text"
										class="form-control" />
									<small class="form-text text-muted">This is a help text</small>
								</div>
							</div>
							
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Trip Destination</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input path="tripDestination" type="text" placeholder="Text"
										class="form-control" />
									<small class="form-text text-muted">This is a help text</small>
								</div>
							</div>
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="select" class=" form-control-label">Car Type</label>
								</div>
								<div class="col-12 col-md-9">
									<form:select path="car" name="select" id="select"
 										class="form-control"> 
 										<c:forEach items="${carCategory}" var="item">
 											<form:option value="${item}">${item.carName}[${item.category.categoryName}](Rs ${item.category.pricePerKm}/KM)</form:option>
										</c:forEach>
 									</form:select>
								</div>
							</div>
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Total Amount</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input path="payment.amount" type="number"
										class="form-control" value = " ${payment.amount}"/>
									<small class="form-text text-muted">This is a help text</small>
								</div>
							</div>
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Discount Amount</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input path="payment.discount" type="number" 
										class="form-control" value = " ${payment.discount}"/>
									<small class="form-text text-muted">This is a help text</small>
								</div>
							</div>
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Booking Done By </label>
								</div>
								<div class="col-12 col-md-9">
									<form:input readonly="true" path="user.userName" type="text" placeholder="Text" class="form-control" /> 
									<small class="form-text text-muted">This is a help text</small>
								</div>
							</div>

							<div class="card-footer">
								<button type="submit" class="btn btn-primary btn-sm">
									<i class="fa fa-dot-circle-o"></i> Submit
								</button>
								<button type="reset" class="btn btn-danger btn-sm">
									<i class="fa fa-ban"></i> Reset
								</button>
							</div>
						</form:form>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>



<!-- form user info -->
<!--                     <div class="card card-outline-secondary"> -->
<!--                         <div class="card-header"> -->
<!--                             <h3 class="mb-0">Trip Information</h3> -->
<!--                         </div> -->
<!--                         <div class="card-body"> -->
<%--                             <form class="form" role="form" autocomplete="off" action = "/addTrip"> --%>
<!--                                 <div class="form-group row"> -->
<!--                                     <label class="col-lg-3 col-form-label form-control-label">Trip Origin</label> -->
<!--                                     <div class="col-lg-9"> -->
<!--                                         <input class="form-control" type="text" value="Jane"> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                                 <div class="form-group row"> -->
<!--                                     <label class="col-lg-3 col-form-label form-control-label">Trip Destination</label> -->
<!--                                     <div class="col-lg-9"> -->
<!--                                         <input class="form-control" type="text" value="Bishop"> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                                 <div class="form-group row"> -->
<!--                                     <label class="col-lg-3 col-form-label form-control-label">Distance</label> -->
<!--                                     <div class="col-lg-9"> -->
<!--                                         <input class="form-control" type="number" value="0"> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                                 <div class="form-group row"> -->
<!--                                     <label class="col-lg-3 col-form-label form-control-label">Select Cab Type</label> -->
<!--                                     <div class="col-lg-9"> -->
<!--                                         <select id="user_time_zone" class="form-control" size="0"> -->
<!--                                             <option value="Hawaii">SUV</option> -->
<!--                                             <option value="Alaska">2 Wheeler</option> -->
<!-- <!--                                             <option value="Mountain Time (US &amp; Canada)">(GMT-07:00) Mountain Time (US &amp; Canada)</option> --> -->
<!-- <!--                                             <option value="Central Time (US &amp; Canada)" selected="selected">(GMT-06:00) Central Time (US &amp; Canada)</option> --> -->
<!-- <!--                                             <option value="Eastern Time (US &amp; Canada)">(GMT-05:00) Eastern Time (US &amp; Canada)</option> --> -->
<!-- <!--                                             <option value="Indiana (East)">(GMT-05:00) Indiana (East)</option> --> -->
<!--                                         </select> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                                 <div class="form-group row"> -->
<!--                                     <label class="col-lg-3 col-form-label form-control-label">Total Amount</label> -->
<!--                                     <div class="col-lg-9"> -->
<!--                                         <input class="form-control" type="number" value="0.0"> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                                 <div class="form-group row"> -->
<!--                                     <label class="col-lg-3 col-form-label form-control-label">Discounted Amount</label> -->
<!--                                     <div class="col-lg-9"> -->
<!--                                         <input class="form-control" type="number" value="0.0" disabled> -->
<!--                                     </div> -->
<!--                                 </div> -->
<!--                                 <div class="form-group row"> -->
<!--                                     <label class="col-lg-3 col-form-label form-control-label"></label> -->
<!--                                     <div class="col-lg-9"> -->
<!--                                         <input type="reset" class="btn btn-secondary" value="Cancel"> -->
<!--                                         <input type="submit" class="btn btn-primary" value="Confirm Booking"> -->
<!--                                     </div> -->
<!--                                 </div> -->
<%--                             </form> --%>
<!--                         </div> -->
<!--                     </div> -->
                    <!-- /form user info -->


<jsp:include page="bottomHtml.jsp"></jsp:include>