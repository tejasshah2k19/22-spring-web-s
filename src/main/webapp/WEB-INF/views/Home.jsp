<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	FirstName : ${userBean.firstName }
	<br> Email : ${userBean.email }
	<br> Password : ${userBean.password }<br>
	
	<a href="listUsers">List Users</a>
</body>
</html>