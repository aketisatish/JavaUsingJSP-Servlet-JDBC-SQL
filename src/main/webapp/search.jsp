<%@page import="com.registrationservlet.UserData"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Successfully searching..</h1>
	<table border="1">
		<tr>
			<th>User Name</th>
			<th>Email</th>
			<th>Country</th>
			<th>Qualification</th>
			<th>Technologies</th>
			<th>Gender</th>
			<th>Address</th>
			<th>comments</th>
			<th>Action</th>
		</tr>
		<%
		List<UserData> userdts = (List<UserData>) request.getAttribute("userdt");
		%>
		<c:forEach items="${userdt}" var="userdt">
			<tr>
				<td>${userdt.username}</td>
				<td>${userdt.email}</td>
				<td>${userdt.selectcountry}</td>
				<td>${userdt.qualification}</td>
				<td>${userdt.gender}</td>
				<td>${userdt.technologies}</td>
				<td>${userdt.address}</td>
				<td>${userdt.commentss}</td>
			</tr>


		</c:forEach>


	</table>
</body>
</html>