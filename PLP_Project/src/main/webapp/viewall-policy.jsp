<%@page import="java.util.List"%>
<%@page import="com.cg.project.model.Policies"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creating Policies Screen</title>
</head>
<body>

</div>
<table class="table">
	<tr>
		<th>Policy Number</th>
		<th>Policy Premium</th>
		<th>Account Number</th>
	</tr>
	
<% Policies policy = (Policies)session.getAttribute("Policies"); %>

	<tr>
		<td><%=policy.getAccountNumber() %></td>
		<td><%=policy.getPolicyPremium() %></td>
		<td><%=policy.getAccountNumber() %></td>
		
	</tr>
</table>
	</div>
</body>
</html>