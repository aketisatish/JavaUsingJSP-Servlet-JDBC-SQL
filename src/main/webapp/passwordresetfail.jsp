<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html"%>
<!DOCTYPE html>
<html>
<body>
<%! Date date=null;
%>
<% date=new Date();
%>
Today Date..<%=date.toString() %>
<h1>Check your Email id </h1>
<h2>Your password is not updated</h2>
</body>
</html>