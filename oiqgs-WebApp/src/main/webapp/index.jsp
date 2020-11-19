<%@page import="java.util.List"%>
<%@page import="com.cg.oiqgs.model.BusinessSegment"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creating businessSegment Screen</title>
</head>
<body>

</div>
<table class="table">
	<tr>
		<th>businessSegmentId</th>
		<th>businessSegmentName</th>
		<th>businessSegmentSeq</th>
	</tr>
	
<% BusinessSegment businessSegment = (BusinessSegment)session.getAttribute("BusinessSegment"); %>

	<tr>
		<td><%=businessSegment.getBusSegId() %></td>
		<td><%=businessSegment.getBusSegName() %></td>
		<td><%=businessSegment.getBusSegSeq() %></td>
		
	</tr>
</table>
	

</div>


</body>
</html>