<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Policy</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<div class="row">
<div class="col-12">
<jsp:include page="header-policy.jsp"></jsp:include>
</div>
<div class="col-12">
<form class="form-group" action="add-policy" method="post">
<label for="policyNumber">Enter Number</label>
<input type="text" name="policyNumber" class="form-control">
<label for="policyPremium">Enter Premium</label>
<input type="text" name="tpolicyPremium" class="form-control">
<label for="accountNumber">Enter Number</label>
<input type="text" name="accountNumber" class="form-control">
<button type="submit" class="btn btn-dark">Added Policy</button>

</form>
</div>
</div>
</div>
</body>
</html>