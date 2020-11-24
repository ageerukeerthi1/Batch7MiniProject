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
<jsp:include page="poldet-header.jsp"></jsp:include>
</div>
<table class="table">
	<tr>
	    <th>PolicyNumber</th>
		<th>QuestionId</th>
		<th>Answer</th>
	</tr>
	
	
	<tr>
	    <td>${policyDetails.policyNumber} </td>
		<td>${policyDetails.questionId}</td>
		<td>${policyDetails.answer} </td>
	</tr>
	
	</table>
	

</div>
</div>
</div>

</body>
</html>