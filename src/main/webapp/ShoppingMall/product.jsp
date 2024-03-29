<%@page import="java.util.List"%>
<%@page import="dao.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 정보</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<jsp:useBean id="productDAO" class="dao.ProductRepository"
	scope="session"></jsp:useBean>
<%
	String id = request.getParameter("id");
	Product p = productDAO.getProductById(id);
%>
<body>
	<jsp:include page="./menu.jsp"></jsp:include>
	<div class="container">
		<h1 class="display-3">상품 정보</h1>
	</div>
	<div class="container">
		<div class="row">
			<div class = "col-md-5">
				<img alt="" src="../resources/images/<%=p.getFilename()%>" style = "width:100%">
			</div>
			<div class="col-md-6">
				<p>상품명 :	<%= p.getPname()%>
				<p>설명 :	<%= p.getDescription()%>
				<p>상품코드 :	<%= p.getProductId()%>
				<p>제조사 :	<%= p.getManufacturer()%>
				<p>분류 :	<%= p.getCategory()%>
				<p>재고 수 :	<%= p.getUnitInstock()%>
				<p>상태 : 	<%= p.getCondition() %>
				<p><h4><%=p.getUnitPrice() %> 원</h4>
				<p><a href = "#" class = "btn btn-info">상품 주문</a>
				<a href = "#" class = "btn btn-secondary">상품 목록</a>
			</div>
		</div>
	</div>
	<jsp:include page="./footer.jsp"></jsp:include>
</body>

</html>