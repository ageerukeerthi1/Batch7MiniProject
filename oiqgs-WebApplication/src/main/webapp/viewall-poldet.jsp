<%@page import="java.util.List"%>
<%@page import="com.cg.oiqgs.model.PolicyDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<div class="col-12">
<jsp:include page="poldet-header.jsp"></jsp:include>
</div>
<table class="table">
<tr>
		<th>PolicyNumber</th>
		<th>QuestionId</th>
		<th>Answer</th>
		</tr>
		
		<tbody> 
 			<% List<PolicyDetails> policy_list = (List)session.getAttribute("policyDetails"); %>
 
			<% 
				for (PolicyDetails policy : policy_list) { 
			%> 
			<tr> 
				<td><%=policy.getPolicyNumber()%></td> 
				<td><%=policy.getQuestionId()%></td> 
				<td><%=policy.getAnswer()%></td> 
				
			</tr> 
			<% 
				} 
			%> 
			</tbody> 
	
	</table>
	

</div>
</div>
</div>

</body>
</html>