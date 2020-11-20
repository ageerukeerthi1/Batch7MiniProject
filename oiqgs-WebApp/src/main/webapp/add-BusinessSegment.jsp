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
<jsp:include page="businessSegment-header.jsp"></jsp:include>
</div>
<div class="col-12">
<form class="form-group" action="add-BusinessSegment" method="post">
<label for="busSegId">Enter BusSegId</label>
<input type="text" name="busSegId" class="form-control">
<label for="busSegName">Enter Name</label>
<input type="text" name="busSegName" class="form-control">
<label for="busSegSeq">Enter BusSegSeq</label>
<input type="text" name="busSegSeq" class="form-control">
<button type="submit" class="btn btn-dark">Add Business Segment</button>

</form>
</div>
</div>
</div>
</body>
</html>