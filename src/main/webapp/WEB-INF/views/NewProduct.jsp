<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
</head>
<body>
	<jsp:include page="../../Menu.jsp"></jsp:include>



	<div class="container-fluid">

		<h2 align="center">Signup</h2>

		<div class="row">

			<div class="col-md-3"></div>
			<div class="col-md-5">

				<h2>New Product</h2>

				<s:form action="saveproduct" method="post" modelAttribute="product">
					<div class="form-group">

						ProductName :
						<s:input path="name" cssClass="form-control" />
						<s:errors path="name"></s:errors>

					</div>

					<div class="form-group">
						Price : <s:input cssClass="form-control" path="price"/>
						<s:errors path="price"></s:errors>
					</div>

					<div class="form-group">

						Qty : <s:input   path="qty" cssClass="form-control" />
					<s:errors path="qty"></s:errors>
					</div>
					<input type="submit" value="SaveProduct" class="btn btn-primary" />
				</s:form>
				<a href="listproduct">List Products</a>
			</div>
		</div>






	</div>


</body>
</html>