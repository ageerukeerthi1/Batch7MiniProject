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
<center>
<form class="form-group" action="add-account" method="post">
<label for="accountNumber"><i>Enter Account Number  </i></label>
<input type="text" name="taccountNumber"><br>
<label for="insuredName"><i>Enter Name  </i></label>
<input type="text" name="tinsuredName"><br>
<label for="insuredStreet"><i>Enter Street  </i></label>
<input type="text" name="tinsuredStreet"><br>
<label for="insuredCity"><i>Enter City </i></label>
<input type="text" name="tinsuredCity"><br>
<label for="insuredState"><i>Enter State</i></label>
<input type="text" name="tinsuredState"><br>
<label for="insuredZip"><i>Enter Zip code</i> </label>
<input type="text" name="tinsuredZip" required minlength="5" maxlength="5"><br>
<label for="businessSegment"><i>Enter Business Segment   :  </i></label>
  <select id="businessSegment" name="tbusinessSegment">
   <option value="select">Select</option>
    <option value="vehicle">Vehicle</option>
    <option value="restaurant">Restaurant</option>
    <option value="apartment">Apartment</option>
    <option value="merchant">General Merchant</option>
  </select><br>
  <label for="userRole"><i>User Name</i> </label>
<input type="text" name="tuserName"><br>
<!--<input type="text" name="tbusinessSegment" class="form-control">-->
<center><button type="submit" class="btn btn-dark"><b><i>Register Account</i></b></button></center>

</form>

</table>
</div>
</div>
</div>
</body>
</html>