<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>After a valid Login</title>
</head>
<body>
<%
if(session.getAttribute("login")==null){
	response.sendRedirect("login.jsp");
}
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
%>
<a href="logout">Logout</a>

<button id="btnInsured" disabled>Insured</button>
<button id="btnClaimHandler" disabled>Claim Handler</button>
<button id="btnClaimAdjuster" disabled>Claim Adjuster</button>

</body>

<script type="text/javascript">
var roleCode='${roleCode}';
switch(roleCode){
	case 'Insured':
		document.getElementById('btnInsured').disabled=true;
		break;
	case 'Claim Handler':
		document.getElementById('btnClaimHandler').disabled=true;
		break;
	case 'Claim Adjuster':
		document.getElementById('btnClaimAdjuster').disabled=false;
		break;
}
<a href="profile.jsp">
</script>
</body>
</html>