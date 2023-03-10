<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@include file="./baseCSS.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<h1 style="text-align: center;">Welcome To ProductCart...!!!</h1>
	<hr>

	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Name</th>
					<th scope="col">Description</th>
					<th scope="col">Price</th>
					<th scope="col">Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${allProductList }" var="p">
					<tr>
						<th scope="row">${p.id }</th>
						<td>${p.name }</td>
						<td>${p.description }</td>
						<td style="font-weight: bold;">&#x20B9;${p.price}</td>
						<td><a href="update/${p.id }"><i class="fa-solid fa-pen" style="padding-right: 3%"></i></a>
							<a href="delete/${p.id }"><i class="fa-solid fa-trash"></i></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="col text-center">
			<a href="addProduct"><button type="submit"
					class="btn btn-outline-primary">Add Product</button></a>
		</div>
	</div>



</body>
</html>