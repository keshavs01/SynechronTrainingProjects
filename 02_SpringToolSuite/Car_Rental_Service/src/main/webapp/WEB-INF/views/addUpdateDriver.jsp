<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="topHtml.jsp"></jsp:include>

<div class="page-container">
	<!-- MAIN CONTENT-->
	<div class="main-content">
		<div class="section__content section__content--p30">
			<div class="container-fluid">
				<div class="card">
					<div class="card-header">
						<strong>Alter Driver</strong> Details
					</div>
					<div class="card-body card-block">
						<form:form action="addUpdateDriver" method="post"
							enctype="multipart/form-data" class="form-horizontal">
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Driver
										ID</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input path="driverId" readonly="${isEdit}" type="number"
										placeholder="Text" class="form-control" />
									<small class="form-text text-muted">${command} This is a help text</small>
								</div>
							</div>
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Driver
										Name</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input path="driverName" type="text" placeholder="Text"
										class="form-control" />
									<small class="form-text text-muted">This is a help text</small>
								</div>
							</div>
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="select" class=" form-control-label">Ratings</label>
								</div>
								<div class="col-12 col-md-9">
									<form:select path="rating" name="select" id="select"
										class="form-control">
										<%-- 										<form:option value="0">Please select</form:option> --%>
										<form:option value="1">1 Star (Lowest)</form:option>
										<form:option value="2">2 Star</form:option>
										<form:option value="3">3 Star</form:option>
										<form:option value="4">4 Star</form:option>
										<form:option value="5">5 Star (Highest)</form:option>
									</form:select>
								</div>
							</div>
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">City</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input path="city" type="text" placeholder="Enter City"
										class="form-control" />
									<small class="form-text text-muted">This is a help text</small>
								</div>
							</div>

							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Mobile</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input path="mobile" type="number" placeholder="Text"
										class="form-control" />
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
<jsp:include page="bottomHtml.jsp"></jsp:include>