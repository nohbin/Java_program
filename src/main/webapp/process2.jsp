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
		String name = request.getParameter("id");
		String pwd = request.getParameter("pwd");
	%>
	
	아이디 : <%= name %>
	비밀번호 : <%= pwd %>
</body>
</html>