<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page  isELIgnored = "false"   %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <%-- <% 
		String h = (String)request.getAttribute("header");
%>  --%>

<h2>
 		${trt}
</h2> 

<hr>
<h2>Creds :</h2>
<p>Email : ${user.email }</p>
<p>Password: ${user.password } </p>
</body>
</html>