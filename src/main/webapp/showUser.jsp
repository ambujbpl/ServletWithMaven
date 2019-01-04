<%@page import="com.ideata.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	i am in show User page 
	
	<%
	  response.setHeader("Cache-Control","no-cache,no-store, must-validate");//Http 1.1
	  response.setHeader("Pragma", "no-cache");//http 1.0
	  response.setHeader("Expires", "0");//Proxies
	  if(session.getAttribute("user") == null){
		response.sendRedirect("login.jsp");  
	  }
	  User u1 = (User)request.getAttribute("user");
	  out.println(u1);
	  out.println("<br><br><br><br>Wellcome ......"+session.getAttribute("user"));
	%>
	<br><br><br><br>
	<a href="dashboard.jsp">Go to Your Dashboard..</a>
</body>
</html>