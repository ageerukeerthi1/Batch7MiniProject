<%@page import="java.util.List"%>
<%@page import="com.cg.project.model.Policies"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		<th>PolicyNumber</th>
		<th>PolicyPremium</th>
		<th>AccountNumber</th>
	</tr>
	
	<c:forEach var="policy" items="${policies}">
	<tr>
	<td>${policy.policyNumber}</td>
		<td>${policy.policyPremium} </td>
		<td>${policy.accountNumber} </td>
		
	</tr>
	</c:forEach>
	
	
	
	</table>
	

</div>
</div>
</div>

</body>
</html>