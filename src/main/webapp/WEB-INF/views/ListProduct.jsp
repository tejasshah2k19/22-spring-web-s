<%@page import="com.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<jsp:include page="../../Menu.jsp"></jsp:include>

	<div class="container-fluid">
		<h2 align="center">List Products</h2>
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<table class="table table-bordered table-hover">   
					<tr>
						<th>ProductId</th>
						<th>Name</th>
						<th>Price</th>
						<th>Qty</th>
						<th>ImgPath</th>
						<th>Img</th>
						<th>Action</th>
					</tr>

					<c:forEach items="${products}" var="p">
						<tr>
							<td>${p.productId}</td>
							<td>${p.name }</td>
							<td>${p.price}</td>
							<td>${p.qty }</td>
							<td>${p.imgurl}</td>
							<td> <img src="${p.imgurl}" /></td>
							<td><a href="deleteproduct?productId=${p.productId }"> Delete </a></td>   
							

						</tr>
					</c:forEach>

				</table>

			</div>

		</div>
	</div>




</body>
</html>














