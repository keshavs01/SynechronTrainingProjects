<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page = "topHtml.jsp"></jsp:include>           
        
		<div class="page-container">
            <!-- MAIN CONTENT-->
            <div class="main-content">
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                <!-- DATA TABLE -->
                                <h5 class="title-5 m-b-35">VIEW TRIPS</h5>
                                
                                <!-- END DATA TABLE -->
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <!-- DATA TABLE-->
                                <div class="table-responsive m-b-40">
                                    <table class="table table-borderless table-data3">
                                        <thead>
                                            <tr>
                                                <th>Trip Id</th>
                                                <th>Trip Origin</th>
                                                <th>Trip Destination</th>
                                                <th>Car Name</th>
                                                <th>Driver Name</th>
                                                <th>Booked By</th>
                                                <th>Discounted Price</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        	<c:forEach items="${tripsList}" var="item">
												<tr>
													<td><c:out value="${item.tripId}"/></td>
													<td><c:out value="${item.tripOrigin}"/></td>
													<td><c:out value="${item.tripDestination}"/></td>
													<td><c:out value="${item.car.carName} "/></td>
													<td><c:out value="${item.driver.driverName} "/></td>
													<td><c:out value="${item.user.userName}"/></td>
													<td><c:out value="${item.payment.amount - item.payment.discount}"/></td>
													<td>
	                                                    <div class="table-data-feature">
	                                                        <a class="item" href="addUpdateTrip?tripid=${item.tripId}" data-toggle="tooltip" data-placement="top" title="Edit">
	                                                            <i class="zmdi zmdi-edit"></i>
	                                                        </a>
	                                                        <a class="item" href="deleteTrip?tripid=${item.tripId}" data-toggle="tooltip" data-placement="top" title="Delete">
	                                                            <i class="zmdi zmdi-delete"></i>
	                                                        </a>
	                                                    </div>
	                                                </td>
												</tr>
											</c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                                <!-- END DATA TABLE-->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

  <jsp:include page = "bottomHtml.jsp"></jsp:include>    