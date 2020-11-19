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
<h1>Business Segment</h1>
<ul>
<li><a href="add-busseg.jsp">Add BusinessSegments</a></li>

<li><a href="view-all">View all Business Segments</a></li>
<li><form action="view-busseg" method="get" class="form-inline"><input type="text" name="bussegId"><button type="submit" class="btn-dark">Search BusSeg</button></form></li>
</ul>
</header>
</body>
</html>