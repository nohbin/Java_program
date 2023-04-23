<%@page import="java.util.Enumeration"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>20230422 에서 데이터 읽기</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String pwd = request.getParameter("pwd");
	String phoneNum = request.getParameter("phone1");
	String phoneNum2 = request.getParameter("phone2");
	String phoneNum3 = request.getParameter("phone3");
	String gender = request.getParameter("gender");
	String[] hobby = request.getParameterValues("hobby");
	
	String city = request.getParameter("city");
	String comment = request.getParameter("comment");
%>

	<p>아이디		: <%= id %>
	<p>비밀번호	: <%= pwd%>
	<p>이름		: <%= name%>
	<p>연락처		: <%= phoneNum + phoneNum2 + phoneNum3%>
	<p>성별 		: <%= gender%>
	<p>취미 		:
	<%
		for(String j : hobby){
			if(j != null){
				out.print(j + "<br>") ;
			}
		}
	%> 
	<p>도시 		: <%= city%>
	<p>메모 		: <%= comment%>
	
	
	<%
	Enumeration<String> en = request.getParameterNames();
	while(en.hasMoreElements()){
		String name1 = en.nextElement();
		String value = request.getParameter(name1);
		out.print("name : " + name1 + "valeu : " + value +"<br>");
	}
	
	%>
</body>
</html>