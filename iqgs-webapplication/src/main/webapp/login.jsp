<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<div align="center">
<h1>Login Page</h1>
<table>
<form action="UserRole" method="post">

<input type="text" name="username">
<input type="password" name="password">
<select name="userType">
<option>Insured</option>
<option>InsuranceAgent</option>
<option>Underwriters</option>
</select>
<input type="submit">

</form>
</table>
</div>
<a href="Logout">Logout</a>
</body>
</html>