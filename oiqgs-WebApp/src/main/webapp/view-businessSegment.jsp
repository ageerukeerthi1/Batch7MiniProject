<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<div class="col-12">
<jsp:include page="businessSegment-header.jsp"></jsp:include>
</div>
<table class="table">
	<tr>
		<th>BusinessSegmentId</th>
		<th>BusinessSegmentName</th>
		<th>BusinessSegmentSeq</th>
	</tr>
	
	
	<tr>
		<td>${BusinessSegment.busSegId}</td>
		<td>${BusinessSegment.busSegName} </td>
		<td>${BusinessSegment.busSegSeq} </td>
	</tr>
	
	</table>
	

</div>
</div>
</div>

</body>
</html>