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
		<h2 align="center">List Users</h2>
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<table class="table table-bordered table-hover">   
					<tr>
						<th>UserId</th>
						<th>FirstName</th>
						<th>Email</th>
						<th>Password</th>
						<th>Action</th>
					</tr>

					<c:forEach items="${users}" var="u">
						<tr>
							<td>${u.userId }</td>
							<td>${u.firstName }</td>
							<td>${u.email }</td>
							<td>${u.password }</td>
							<td><a href="deleteuser?userId=${u.userId }"> Delete </a></td>   
							

						</tr>
					</c:forEach>

				</table>

			</div>

		</div>
	</div>




</body>
</html>














