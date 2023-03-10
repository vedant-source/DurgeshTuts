<!DOCTYPE html>
<html>
<head>
	<title>Forgot Password</title>
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
		<h2>Forgot Password</h2>
		<form action="verifyEmail">
			<label for="email">Enter your email:</label>
			<input type="email" id="email" name="email" required>
			<button type="submit">Submit</button>
		</form>
	</div>
</body>
</html>
