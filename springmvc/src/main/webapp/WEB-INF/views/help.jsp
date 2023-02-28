<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored = "false" %>   
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
<% 
/* String title =(String)request.getAttribute("heading"); */
LocalDateTime t =(LocalDateTime)request.getAttribute("time");
%>

<h3>
<%= t.toString() %>
</h3>

				<h2>
			<!-- Use Of EL syntax -->
			${heading }
				</h2>

<hr>
<h2>Marks</h2>
 <c:forEach var="item" items="${markList}">
		<h2>${item}</h2>
</c:forEach> 
			
</body>
</html>