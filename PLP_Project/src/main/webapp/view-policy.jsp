<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Policy</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<div class="row">
<div class="col-12">
<div class="col-12">
<jsp:include page="header-policy.jsp"></jsp:include>
</div>
<table class="table">
	<tr>
		<th>Policy Number</th>
		<th>Policy Premium</th>
		<th>Account Number</th>
	</tr>
	
	
	<tr>
	
		<td>${policy.policyNumber}</td>
		<td>${policy.policyPremium}</td>
		<td>${policy.accountNumber}</td>
	</tr>
	
	</table>
	</div>
</div>
</div>

</body>
</html>






