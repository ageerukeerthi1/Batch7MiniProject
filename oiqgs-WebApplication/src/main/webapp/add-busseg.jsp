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
<jsp:include page="header.jsp"></jsp:include>
</div>
<div class="col-12">
<form class="form-group" action="add-busseg" method="post">
<label for="busSegId">Enter ID</label>
<input type="text" name="busSegId" class="form-control">
<label for="busSegName">Enter Name</label>
<input type="text" name="busSegName" class="form-control">
<label for="busSegSeq">Enter Seq</label>
<input type="text" name="busSegSeq" class="form-control">
<button type="submit" class="btn btn-dark">Register Business Segment</button>

</form>
</div>
</div>
</div>
</body>
</html>