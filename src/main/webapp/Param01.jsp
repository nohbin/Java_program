<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URI"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Param Action Tag</h3>
	<jsp:forward page="./Param01_data.jsp">
		<jsp:param value="admin" name="id"/>
		<jsp:param value='<%=URLEncoder.encode("관리자") %>' name="name"/>
	</jsp:forward>
</body>
</html>