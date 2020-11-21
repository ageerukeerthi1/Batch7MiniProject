<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Account Creation</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<div class="row">
<div class="col-12">
<jsp:include page="account-header.jsp"></jsp:include>
</div>
<div class="col-12">
<table border=1>
<form class="form-group" action="add-account" method="post">
<label for="accountNumber"><b><i>Enter Account Number</i></b></label>
<input type="text" name="taccountNumber" class="form-control">
<label for="insuredName"><b><i>Enter Name</i></b></label>
<input type="text" name="tinsuredName" class="form-control">
<label for="insuredStreet"><b><i>Enter Street</i></b></label>
<input type="text" name="tinsuredStreet" class="form-control">
<label for="insuredCity"><b><i>Enter City</i></b></label>
<input type="text" name="tinsuredCity" class="form-control">
<label for="insuredState"><b><i>Enter State</i></b></label>
<input type="text" name="tinsuredState" class="form-control">
<label for="insuredZip"><b><i>Enter Zip code</i></b> </label>
<input type="text" name="tinsuredZip" class="form-control">
<label for="businessSegment"><b><i>Enter Business Segment   :  </i></b></label>
  <select id="businessSegment" name="tbusinessSegment">
   <option value="select">Select</option>
    <option value="vehicle">Vehicle</option>
    <option value="restaurant">Restaurant</option>
    <option value="apartment">Apartment</option>
    <option value="merchant">General Merchant</option>
  </select><br>
  <label for="userRole"><b><i>User Name</i></b> </label>
<input type="text" name="tuserName" class="form-control">
<!--<input type="text" name="tbusinessSegment" class="form-control">-->
<center><button type="submit" class="btn btn-dark"><b><i>Register Account</i></b></button></center>

</form>
</table>
</div>
</div>
</div>
</body>
</html>