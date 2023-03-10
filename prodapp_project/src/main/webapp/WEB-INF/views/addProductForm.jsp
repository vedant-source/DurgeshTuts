<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./baseCSS.jsp"%>

</head>
<body>
	<h2 style="text-align: center;">Add Product</h2>
	<hr>
	<form action="handleProd", method="post">
		<div class="row">
			<div class="mx-auto col-10 col-md-8 col-lg-6">
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Product
						Name </label> <input type="text" class="form-control"
						id="exampleFormControlInput1" placeholder="Enter Product Name"
						name="name">
				</div>
				<div class="mb-3">
					<label for="exampleFormControlTextarea1" class="form-label">Product
						Description</label>
					<textarea class="form-control" id="exampleFormControlTextarea1"
						rows="3" name="description"></textarea>
				</div>
				<div class="mb-3">
					<label for="exampleFormControlInput1" class="form-label">Price</label>
					<input type="text" class="form-control"
						id="exampleFormControlInput1" placeholder="Enter Product Price"
						name="price">
				</div>

				<div class="row">
					<div class="text-center">
						<a href="${pageContext.request.contextPath }/home">
							<button type="button" class="btn btn-outline-success">Back</button>
						</a>
						<button type="submit" class="btn btn-primary">submit</button>
					</div>
				</div>

			</div>
		</div>

	</form>

</body>
</html>