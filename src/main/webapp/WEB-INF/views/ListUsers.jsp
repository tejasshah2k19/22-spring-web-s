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
	<h2>List Users</h2>


	<a href="signup">New USer</a>
	<BR>
	<br>

	<table border="1">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
		</tr>

		<c:forEach items="${users}" var="u">
			<tr>
				<td>${u.userId }</td>
				<td>${u.firstName }</td>
				<td>${u.email }</td>
				<td>${u.password }</td>

			</tr>
		</c:forEach>

	</table>

</body>
</html>














