<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바 빈 사용</title>
</head>
<body>
	<jsp:useBean id="p" class="dao.Person" scope="request"></jsp:useBean>
	<h4>아이디 : <%= p.getId() %></h4>		
	<h4>이름 : <%= p.getName() %></h4>		
</body>
</html>