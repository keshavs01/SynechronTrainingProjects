<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page = "topHtml.jsp"></jsp:include>           
        
		<div class="page-container">
            <!-- MAIN CONTENT-->
            <div class="main-content">
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                <!-- DATA TABLE -->
                                <h5 class="title-5 m-b-35">View Driver</h5>
                                <!-- END DATA TABLE -->
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <!-- DATA TABLE-->
                                <div class="table-responsive m-b-40">
<%--                                 	<form:form action="addUpdateDriver" method="post" class="form-horizontal"> --%>
                                
                                    <table class="table table-borderless table-data3">
                                        <thead>
                                            <tr>
                                                <th>Driver Id</th>
                                                <th>Driver Name</th>
                                                <th>Rating</th>
                                                <th>City</th>
                                                <th>Mobile</th>
                                                <th>Payment Amount</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        	<c:forEach items="${driversList}" var="item">
												<tr>
													<td><c:out value="${item.driverId}"/></td>
													<td><c:out value="${item.driverName}"/></td>
													<td><c:out value="${item.rating}"/></td>
													<td><c:out value="${item.city} "/></td>
													<td><c:out value="${item.mobile} "/></td>
													<td><c:out value="${item.paymentId} "/></td>
													<td>
	                                                    <div class="table-data-feature">
<!-- 	                                                        <button class="item" data-toggle="tooltip" data-placement="top" title="Send"> -->
<!-- 	                                                            <i class="zmdi zmdi-mail-send"></i> -->
<!-- 	                                                        </button> -->
<%-- 															<form:form action="addUpdateDriver" method="post"> --%>
<%-- <%-- 																<form:input class="item"  /> --%> 
<%-- 	                                                            <form:button type="submit"><i class="zmdi zmdi-edit"></i></form:button> --%>
	                                                        
<%-- 															</form:form> --%>
	                                                        <a class="item" href="addUpdateDriver?driverid=${item.driverId}" data-toggle="tooltip" data-placement="top" title="Edit">
	                                                            <i class="zmdi zmdi-edit"></i>
	                                                        </a>
	                                                        <a class="item" href="deleteDriver?driverid=${item.driverId}" data-toggle="tooltip" data-placement="top" title="Delete">
	                                                            <i class="zmdi zmdi-delete"></i>
	                                                        </a>
<!-- 	                                                        <button class="item" data-toggle="tooltip" data-placement="top" title="More"> -->
<!-- 	                                                            <i class="zmdi zmdi-more"></i> -->
<!-- 	                                                        </button> -->
	                                                    </div>
	                                                </td>
												</tr>
											</c:forEach>
                                        </tbody>
                                    </table>
<%--                                     </form:form> --%>
                                </div>
                                <!-- END DATA TABLE-->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

  <jsp:include page = "bottomHtml.jsp"></jsp:include>    