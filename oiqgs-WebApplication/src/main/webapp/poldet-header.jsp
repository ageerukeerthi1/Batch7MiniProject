<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Business Segment</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style type="text/css">
ul{
display: inline;
}
li{
display: inline;
list-style: none;
}
header{
background-color: gray;
}
h1{
color: white;
}
</style>
</head>
<body>
<header>
<h1>Policy Details</h1>
<ul>
<li><a href="add-poldet.jsp">Add Policy Details</a></li>

<li><a href="policydetails.jsp">View all PolicyDetails</a></li>
<li><form action="view-poldet" method="get" class="form-inline">
	
	<input type="text" name="PolicyNumber">
	<button type="submit" class="btn-dark">Search Policy Details</button>
	</form>
</li>
</ul>
</header>
</body>
</html>