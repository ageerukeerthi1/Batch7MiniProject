<%@page import="java.util.List"%>
<%@page import="com.cg.iqgs.model.UserRoles"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creating Login Screen</title>
</head>
<body>

</div>
<table class="table">
	<tr>
		<th>Username</th>
		<th>Password</th>
		<th>Rolecode</th>
	</tr>
	
<% UserRoles userRoles = (UserRoles)session.getAttribute("UserRoles"); %>

	<tr>
		<td><%=userRoles.getUserName() %></td>
		<td><%=userRoles.getPassword() %></td>
		<td><%=userRoles.getRoleCode() %></td>
		
	</tr>
</table>
	

</div>


</body>
</html>