<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h2>Home Page</h2>

<%

		String nm =(String)request.getAttribute("name");
		List<String> frdList =(List<String>)request.getAttribute("frds");
%>

<h3>
		Name : <%= nm %>
</h3>

<h3>
		Friend Circle : 
		<%
		for(String f : frdList){
		%>
	<h1>
		<%= f %>
		</h1>
		<%} %>
		
</h3>

</body>
</html>
