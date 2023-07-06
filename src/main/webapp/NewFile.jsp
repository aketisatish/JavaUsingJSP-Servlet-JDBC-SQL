<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
Date date=null;
%>
<% date=new Date(); %>
Today Date...<%=date.toString() %>
<h1>login successfull..</h1>
</body>
</html>