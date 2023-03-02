
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<link href="<c:url value="/resources/css/style.css" />"> 

<script src="<c:url value="/resources/js/script.js"  />"></script>


<style type="text/css">
@import
	url("https://fonts.googleapis.com/css2?family=Poppins:weight@100;200;300;400;500;600;700;800&display=swap")
	;

body {
	background-color: bisque;
	font-family: "Poppins", sans-serif;
	font-weight: 300;
}

.height {
	height: 100vh;
}

.search {
	position: relative;
	box-shadow: 0 0 40px rgba(51, 51, 51, .1);
}

.search input {
	height: 60px;
	text-indent: 25px;
	border: 2px solid #d6d4d4;
}

.search input:focus {
	box-shadow: none;
	border: 2px solid blue;
}

.search .fa-search {
	position: absolute;
	top: 20px;
	left: 16px;
}

.search button {
	position: absolute;
	top: 5px;
	right: 5px;
	height: 50px;
	width: 110px;
	background: blue;
}
</style>


<title>my_search!</title>
</head>
<body>
	<!--  <h1>Hello, world!</h1>
     -->


	<div class="container">



		<div
			class="row height d-flex justify-content-center align-items-center">

			<img
				style="height: 47%; margin-bottom: -25%; width: 67%; margin-top: -70px;"
				src="<c:url value="/resources/image/digiBharat.jpg" />" />


			<div class="col-md-8">
				<h2 style="text-align: center">OK GOOGLE</h2>
				<form action="search">

					<div class="search">
						<i class="fa fa-search"></i> <input type="text" name="querybox"
							class="form-control" placeholder="Search for URL? Ask Now">

						<button class="btn btn-primary">Search</button>

					</div>

				</form>
			</div>

		</div>
	</div>



	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
</body>
</html>