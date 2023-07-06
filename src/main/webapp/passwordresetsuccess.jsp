<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<%! Date date=null;
%>
<%date=new Date();
%>
Today Date...<%=date.toString() %>
<h1>Your password updated successfully</h1>
</body>
</html>