<%@include file="./baseCSS.jsp"%>
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

<title>LogIn Page!</title>

<style>
.err {
	color: red;
}
</style>



</head>
<body>

	<div style="margin-top: 10%">
		<!-- Section: Design Block -->
		<section class="">
			<!-- Jumbotron -->
			<div class="px-4 py-5 px-md-5 text-center text-lg-start"
				style="background-color: hsl(0, 0%, 96%)">
				<div class="container">
					<div class="row gx-lg-5 align-items-center">
						<div class="col-lg-6 mb-5 mb-lg-0">
							<h1 class="my-5 display-3 fw-bold ls-tight">
								Log In <br /> <span class="text-primary"> To Product App</span>
							</h1>
							<!-- 	<p style="color: hsl(217, 10%, 50.8%)">Lorem ipsum dolor sit
							amet consectetur adipisicing elit. Eveniet, itaque accusantium
							odio, soluta, corrupti aliquam quibusdam tempora at cupiditate
							quis eum maiores libero veritatis? Dicta facilis sint aliquid
							ipsum atque?</p> -->
						</div>

						<div class="col-lg-6 mb-5 mb-lg-0">
							<div class="card">



								<div style="margin-left: 83%; margin-top: 2%">
									<a href="signUpCont">Sign Up</a>
								</div>
								<div class="card-body py-5 px-md-5">
									<c:if test="${ not empty errmsg}">
										<p class="err">${errmsg}</p>
									</c:if>
									<form action="logInCreds" method="post">

										<!-- Email input -->
										<div class="form-outline mb-4 ">
											<label class="form-label" for="form3Example3"><b>Email
													address</b></label> <input type="email" id="form3Example3"
												class="form-control" placeholder="Enter your email"
												name="email" required />

										</div>

										<!-- Password input -->
										<div class="form-outline mb-4">
											<label class="form-label" for="form3Example4"><b>Password</b></label>
											<input type="password" id="form3Example4"
												class="form-control" placeholder="Enter your password"
												name="password" required />

										</div>

										<!-- <a href="" style="text-align: center;">Forgotten password?</a> -->

										<a href="forgotpassword"><p style="text-align: center">Forgotten
												password?</p></a>

										<!-- Checkbox -->
										<div class="form-check d-flex justify-content-center mb-4">
											<input class="form-check-input me-2" type="checkbox" value=""
												id="form2Example33" checked disabled /> <label
												class="form-check-label" for="form2Example33">
												Subscribe to our newsletter </label>
										</div>





										<!-- Submit button -->
										<div class="d-flex justify-content-center">
											<button type="submit" class="btn btn-primary btn-block mb-4">Log
												In</button>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- Jumbotron -->
		</section>
		<!-- Section: Design Block -->
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