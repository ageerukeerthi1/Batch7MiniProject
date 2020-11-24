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
<jsp:include page="busseg-header.jsp"></jsp:include>
</div>
<div class="col-12">
<form class="form-group" action="add-busseg" method="post">
<label for="bus_Seg_Id">Enter ID</label>
<input type="text" name="bus_Seg_Id" class="form-control">
<label for="bus_Seg_Name">Enter Name</label>
<input type="text" name="bus_Seg_Name" class="form-control">
<label for="bus_Seg_Seq">Enter Seq</label>
<input type="text" name="bus_Seg_Seq" class="form-control" maxlength="3">
<button type="submit" class="btn btn-dark">Add Business Segment</button>

</form>
</div>
</div>
</div>
</body>
</html>