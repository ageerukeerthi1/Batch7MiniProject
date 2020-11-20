<%@page import="java.util.List"%>
<%@page import="com.cg.oiqgsWebAppProj.model.Accounts"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creating Account Creation Screen</title>
</head>
<body>

</div>
<table class="table">
	<tr>
		<th>Account Number</th>
		<th>Insured Name</th>
		<th>Insured Street</th>
		<th>Insured City</th>
		<th>Insured State</th>
		<th>Insured Zip</th>
		<th> Business Segment</th>
	</tr>
	
<% Accounts account = (Accounts)session.getAttribute("Accounts"); %>

	<tr>
		<td><%=account.getAccountNumber() %></td>
		<td><%=account.getInsuredName() %></td>
		<td><%=account.getInsuredStreet() %></td>
		<td><%=account.getInsuredCity() %></td>
		<td><%=account.getInsuredState() %></td>
		<td><%=account.getInsuredZip() %></td>
		<td><%=account.getBusinessSegment() %></td>
		
	</tr>
</table>
	

</div>


</body>
</html>
