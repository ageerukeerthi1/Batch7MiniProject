<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account</title>
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
<h1>Account</h1>
<ul>
<li><a href="add-account.jsp">Add Account</a></li>

<!--<li><a href="view-all">View all Accounts</a></li>-->
<li><form action="view-account" method="get" class="form-inline"><input type="text" name="taccountNumber"><button type="submit" class="btn-dark">Search account</button></form></li>
</ul>
</header>
</body>
</html>