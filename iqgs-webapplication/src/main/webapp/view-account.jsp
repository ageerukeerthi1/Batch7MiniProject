<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cg.iqgs.model.Accounts"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Account</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<div class="container">
<div class="row">
<div class="col-12">
<jsp:include page="account-header.jsp"></jsp:include>
</div>
<table class="table" border=1>
	<tr>
		<th>Account Number</th>
		<th>Insured Name</th>
		<th>Insured Street</th>
		<th>Insured City</th>
		<th>Insured State</th>
		<th>Insured Zip</th>
		<th> Business Segment</th>
		<th> User Name</th>
	</tr>
<% Accounts account = (Accounts)session.getAttribute("accounts"); %>	
	
	<tr>
	   <!-- <td>${account.accountNumber} </td>
		<td>${account.insuredName} </td>
		<td>${account.insuredStreet} </td>
		<td>${account.insuredCity} </td>
		<td>${account.insuredState} </td>
		<td>${account.insuredZip} </td>
		<td>${account.businessSegment} </td> -->
		<td><%=account.getAccountNumber() %></td>
		<td><%=account.getInsuredName() %></td>
		<td><%=account.getInsuredStreet() %></td>
		<td><%=account.getInsuredCity() %></td>
		<td><%=account.getInsuredState() %></td>
		<td><%=account.getInsuredZip() %></td>
		<td><%=account.getBusinessSegment() %></td>
		<td><%=account.getUserName() %></td>
		
	</tr>
	
	</table>
	

</div>
</div>
</div>
</body>
</html>