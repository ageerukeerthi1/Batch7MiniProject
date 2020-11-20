<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-12">
<div class="col-12">
<jsp:include page="header.jsp"></jsp:include>
</div>
<table class="table">
	<tr>
		<th>userName</th>
		<th>password</th>
		<th>roleCode</th>
	</tr>
	
	
	<tr>
		<td>${userrole.userName}</td>
		<td>${userrole.password} </td>
		<td>${userrole.roleCode} </td>
	</tr>
	
	</table>
	

</div>
</div>
</div>

</body>
</html>