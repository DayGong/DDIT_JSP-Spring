<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Filter</title>
</head>
<body>
	<%
		String userId = (String) session.getAttribute("userID");
	%>
	<p><%=userId%>님 로그인을 성공했습니다.</p>

</body>
</html>