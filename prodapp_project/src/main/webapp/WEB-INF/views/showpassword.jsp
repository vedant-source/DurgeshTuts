<%@include file="./baseCSS.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Creds Page</title>
<!-- <link rel="stylesheet" type="text/css" href="style.css"> -->

<style type="text/css">
.container {
	max-width: 400px;
	margin: auto;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 5px;
	background-color: #f2f2f2;
}

h2 {
	text-align: center;
}

form {
	display: flex;
	flex-direction: column;
}

label {
	margin-top: 10px;
}

input[type="email"] {
	padding: 10px;
	margin-bottom: 20px;
	border-radius: 5px;
	border: none;
}

button[type="submit"] {
	background-color: #4CAF50;
	color: #fff;
	padding: 10px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

button[type="submit"]:hover {
	background-color: #45a049;
}
</style>

</head>
<body>
	<div class="container" style="margin-top: 5%;">
		<h2>User Credentials</h2>
		
		<form>
			<label for="firstName">First Name :</label>
			 <input type="text" id="firstName" name="firstName" value="${creds.firstName }" required >
				
				 <label for="lastName">Last Name :</label>
				 <input type="text" id="lastName" name="lastName" value="${creds.lastName }" required> 
				
				<label for="email">Email:</label> 
				<input type="email" id="email" name="email" value="${creds.email }" required>

				<label for="password">Password :</label> <input type="text"
				id="password" name="password" value="${creds.password }" required>


		</form>
	</div>
</body>
</html>
