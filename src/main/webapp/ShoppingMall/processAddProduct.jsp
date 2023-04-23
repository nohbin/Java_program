<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dao.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="productDao" class = "dao.ProductRepository" 
scope="session"></jsp:useBean>
<body>
	<%
	String id = request.getParameter("productId");
	String name = request.getParameter("productName");
	Integer price = Integer.parseInt(request.getParameter("unitPrice"));
	String manuF = request.getParameter("manufacturer");
	Long stock = Long.parseLong(request.getParameter("unitInstock")); 
	String des = request.getParameter("description");
	String con = request.getParameter("condition");
	String category = request.getParameter("category");
	
	Product p = new Product(id, name, price, des,manuF, category, stock, con);
	
	productDao.addProduct(p);
	response.sendRedirect("products.jsp");	
	%>
	

</body>
</html>