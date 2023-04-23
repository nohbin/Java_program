<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session"></jsp:useBean>
</head>
<%-- <%@ include file = "./menu.jsp" %> --%>


	<jsp:include page="./menu.jsp"></jsp:include>
<div class="container">
	<h1 class="display-3">상품 등록</h1>
</div>


<body>
	<div class = "container">
		<form name = "newProduct" action="processAddProduct.jsp" method="post"
		class="form-horizontal"
		enctype="multipart/form-data" >
			<div class = "form-group row" style = "padding: 10px">
				<label class = "col-sm-2">상품코드</label>
				<div class = 'col-sm-3'>
					<input type = "text" name = "productId" class = "form-control">
				</div>
			</div>
			<div class = "form-group row" style = "padding: 10px">
				<label class = "col-sm-2">상품명</label>
				<div class = 'col-sm-3'>
					<input type = "text" name = "productName" class = "form-control">
				</div>
			</div>
			<div class = "form-group row" style = "padding: 10px">
				<label class = "col-sm-2">가격</label>
				<div class = 'col-sm-3'>
					<input type = "text" name = "unitPrice" class = "form-control">
				</div>
			</div>
			
			<div class = "form-group row" style = "padding: 10px">
				<label class = "col-sm-2">제조사</label>
				<div class = 'col-sm-3'>
					<input type = "text" name = "manufacturer" class = "form-control">
				</div>
			</div>
			<div class = "form-group row" style = "padding: 10px">
				<label class = "col-sm-2">분류</label>
				<div class = 'col-sm-3'>
					<input type = "text" name = "category" class = "form-control">
				</div>
			</div>
			<div class = "form-group row" style = "padding: 10px">
				<label class = "col-sm-2">재고량</label>
				<div class = 'col-sm-3'>
					<input type = "text" name = "unitInStock" class = "form-control">
				</div>
			</div>
			<div class = "form-group row" style = "padding: 10px">
				<label class = "col-sm-2">상세정보</label>
				<div class = 'col-sm-5'>
					<textarea name = 'description'rows="2" cols="50" class = 'form-control'></textarea>
				</div>
			</div>
			<div class = "form-group row" style = "padding: 10px">
				<label class = "col-sm-2">상태</label>
				<div class = 'col-sm-5'>
					<input type = "radio" name = "condition" value="new" checked="checked">A급
					<input type = "radio" name = "condition" value="old">B급
					<input type = "radio" name = "condition" value="refurb">Refurb
				</div>
			</div>
			<div class = "form-group row" style = "padding: 10px">
				<label class= "col-sm-2">이미지</label>
				<div class = 'col-sm-5'>
					<input type = "file" name = "productImage" class = "form-control">
				</div>
			</div>
			
			<div class = "form-group row" style = "padding: 10px">
				<div class = 'col-sm-offset-2 col_sm-10'>
					<input type = "submit" class = "btn btn-primary" value = "등록">
				</div>
			</div>
		</form>
	</div>	
	
	




</body>
<jsp:include page="./footer.jsp"></jsp:include>

<script>
	const $currentActive = document.querySelector('.nav-link.active');
	$currentActive.className = $currentActive.className.replace('active',"");
	const $productregister = document.querySelector('#productRegister');
	$productregister.className += ' active';
</script>


</html>