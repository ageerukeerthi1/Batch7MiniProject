<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Account</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<div class="row">
<div class="col-12">
<jsp:include page="account-header.jsp"></jsp:include>
</div>
<div class="col-12">
<form class="form-group" action="add-account" method="post">
<label for="accountNumber">Enter Account Number</label>
<input type="text" name="taccountNumber" class="form-control">
<label for="insuredName">Enter Name</label>
<input type="text" name="tinsuredName" class="form-control">
<label for="insuredStreet">Enter Street</label>
<input type="text" name="tinsuredStreet" class="form-control">
<label for="insuredCity">Enter City</label>
<input type="text" name="tinsuredCity" class="form-control">
<label for="insuredState">Enter State</label>
<input type="text" name="tinsuredState" class="form-control">
<label for="insuredZip">Enter Zip code</label>
<input type="text" name="tinsuredZip" class="form-control">
<label for="businessSegment">Enter Business Segment</label>
<input type="text" name="tbusinessSegment" class="form-control">
<button type="submit" class="btn btn-dark">Register Account</button>

</form>
</div>
</div>
</div>
</body>
</html>