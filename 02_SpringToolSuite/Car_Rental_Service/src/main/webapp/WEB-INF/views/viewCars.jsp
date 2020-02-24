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
                                <h5 class="title-5 m-b-35">View Cars</h5>
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
                                                <th>Car Id</th>
                                                <th>Car Name</th>
                                                <th>Rating</th>
                                                <th>Car Category</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        	<c:forEach items="${carsList}" var="item">
												<tr>
													<td><c:out value="${item.carId}"/></td>
													<td><c:out value="${item.carName}"/></td>
													<td><c:out value="${item.rating}"/></td>
													<td><c:out value="${item.category.categoryName} "/></td>
													<td>
	                                                    <div class="table-data-feature">
<!-- 	                                                        <button class="item" data-toggle="tooltip" data-placement="top" title="Send"> -->
<!-- 	                                                            <i class="zmdi zmdi-mail-send"></i> -->
<!-- 	                                                        </button> -->
<%-- 															<form:form action="addUpdateDriver" method="post"> --%>
<%-- <%-- 																<form:input class="item"  /> --%> 
<%-- 	                                                            <form:button type="submit"><i class="zmdi zmdi-edit"></i></form:button> --%>
	                                                        
<%-- 															</form:form> --%>
	                                                        <a class="item" href="addUpdateCar?carid=${item.carId}" data-toggle="tooltip" data-placement="top" title="Edit">
	                                                            <i class="zmdi zmdi-edit"></i>
	                                                        </a>
	                                                        <a class="item" href="deleteCar?carid=${item.carId}" data-toggle="tooltip" data-placement="top" title="Delete">
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