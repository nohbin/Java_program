<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>처리</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
	%>
	
	이름은 : <%= name %>
</body>
</html>