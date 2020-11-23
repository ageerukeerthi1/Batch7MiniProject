<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
<jsp:include page="poldet-header.jsp"></jsp:include>
</div>
<div class="col-12">

<form class="form-group" action="add-poldet" method="post">

<label for="policyNumber">Enter Number</label>
<input type="text" name="policyNumber" class="form-control">
<label for="questionId">Enter ID</label>
<input type="text" name="questionId" class="form-control">
<label for="answer">Enter answer</label>
<input type="text" name="answer" class="form-control">
<button type="submit" class="btn btn-dark">Add Policy Details</button>

</form>
</div>
</div>
</div>
</body>
</html>