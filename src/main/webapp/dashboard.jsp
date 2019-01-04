<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control","no-cache,no-store, must-validate");
	  if(session.getAttribute("user") == null){
		response.sendRedirect("login.jsp");  
	  }
	%>
	<h1>Hello, Welcome to Dashbaord</h1><br><br><br><br>
	
	<form action="logout">
		<input type="submit" value="Logout"/>
	</form>
</body>
</html>