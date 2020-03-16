<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/l0_master_servlets_jsp/getServlet" method="get">
<table>
		<tr>
			<th> Username </th>
			<th> Password </th>
		</tr>
	
<%
 ResultSet rs = (ResultSet) request.getAttribute("uname");
while (rs.next()) {
	%>
	<tr>
		<td> <% out.println(rs.getString("username")); %> </td>
		<td> <% out.println(rs.getString("password")); %> </td>
	</tr>	
	<% } %>
	</table>
</form>
</body>
</html>