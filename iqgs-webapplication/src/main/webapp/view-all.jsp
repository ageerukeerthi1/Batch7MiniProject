<%@page import="java.util.List"%>
<%@page import="com.cg.iqgs.model.BusinessSegment"%>
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
<jsp:include page="busseg-header.jsp"></jsp:include>
</div>
<table class="table">
	<tr>
		<th>BusSegId</th>
		<th>BusSegSeq</th>
		<th>BusSegName</th>
		</tr>
		
		<tbody> 
 			<% List<BusinessSegment> businessSegment_list = (List)session.getAttribute("businessSegments"); %>
 
			<% 
				for (BusinessSegment business : businessSegment_list) { 
			%> 
			<tr> 
				<td><%=business.getBusSegId()%></td> 
				<td><%=business.getBusSegSeq()%></td> 
				<td><%=business.getBusSegName()%></td> 
				
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