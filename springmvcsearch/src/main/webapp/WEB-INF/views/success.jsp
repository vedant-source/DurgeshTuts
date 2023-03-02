<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- private String name;
		private Long id;
		private String date;
		private List<String> courses;
		private String gender;
		private String type;
		private Address address; -->

<h2>Student Details :</h2>
<hr>
<h3>Id : ${student.id }</h3>
<h3>Name : ${student.name }</h3>
<h3>Id : ${student.courses }</h3>
<h3>Id : ${student.gender }</h3>
<h3>DOB : ${student.date }</h3>
<h3>Id : ${student.type }</h3>
<hr>
<h2>Address Details :</h2>
<h3>Id : ${student.address.street }</h3>
<h3>Id : ${student.address.city }</h3>
</body>
</html>