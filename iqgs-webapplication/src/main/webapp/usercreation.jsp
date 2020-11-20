<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Creation</title>
</head>
<body>

<h1>User Creation</h1>

<%
if(session.getAttribute("UserName")==null){
	response.sendRedirect("login.jsp");
   }
	response.setHeader("Cache-Control", "no-Cache,no-store, must-revalidate");
%>
<a href="logout">Logout</a>

<button id="btnInsured" disabled>Insured</button>
<button id="btnInsuranceAgent" disabled>InsuranceAgent</button>
<button id="btnUnderwriters" disabled>Underwriters</button>

</body>
<script type="text/javascript">
var userType-'${userType}';
switch(userType){
	case 'Insured':
		document.getElementById('btnInsured').disabled=false;
		break;
	case 'InsuranceAgent':
		document.getElementById('btnInsuranceAgent').disabled=false;
		break;
	case 'Underwriters':
		document.getElementById('btnUnderwriters').disabled=false;
		break;
}
</script>
</html>
