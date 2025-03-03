<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<title>주문 취소</title>
</head>
<body>

<%@ include file="menu.jsp" %>

<div class="jumbotron">
	<!-- container : 내용이 들어감 -->
	<div class="container">
		<h1 class="display-3">주문 취소</h1>
	</div>
</div>
<div class="container">
	<h2 class="alert alert-danger">주문이 취소되었습니다.</h2>
</div>
<div class="container">
	<p><a href="./products.jsp" class="btn btn-secondary">&laquo; 상품 목록</a></p>
</div>
 
<%@ include file="footer.jsp" %>

</body>
</html>