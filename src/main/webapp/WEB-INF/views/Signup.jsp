<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>

	<jsp:include page="../../Menu.jsp"></jsp:include>

	<div class="container-fluid">

		<h2 align="center">Signup</h2>

		<div class="row">

			<div class="col-md-3"></div>
			<div class="col-md-6">

				<form action="saveuser" method="post">
					<div class="form-group">
						FirstName:<input type="text" name="firstName" class="form-control">
					</div>

					<div class="form-group">
						Email:<input type="text" name="email" class="form-control">
					</div>
					<div class="form-group">
					Password: <input type="text" name="password" class="form-control">			
				</div>
     
				<button class="btn btn-primary">Signup</button>
				</form>
			</div>
		</div>

	</div>


</body>
</html>