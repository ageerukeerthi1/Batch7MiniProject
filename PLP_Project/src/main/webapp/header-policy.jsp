<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Policy</title>
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
<h1>Policy</h1>
<ul>
<li><a href="add-policy.jsp">Add Policies</a></li>

<!--<li><a href="viewall-policy">View all Policies</a></li>-->
<li><form action="view-policy" method="get" class="form-inline"><input type="text" name="policyNumber"><button type="submit" class="btn-dark">Search policy</button></form></li>
</ul>
</header>
</body>
</html>