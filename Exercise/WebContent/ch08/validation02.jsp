<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Validation</title>
</head>
<script type="text/javascript">
	function CheckLogin() {
		var form = document.loginForm;
		if (form.id.value == "") {
			alert("아이디를 입력해주세요.");
			form.id.focus();
			return false;
		} else if (form.passwd.value == "") {
			alert("비밀번호를 입력해주세요.");
			form.passwd.focus();
			return false;
		}
		form.submit();
	}
</script>
<body>
	<form name="loginForm" action="validation02_process.jsp" method="post">
		<p>아이디: <input type="text" name="id" /></p>
		<p>비밀번호: <input type="password" name="passwd" /></p>
		<p><input type="button" value="전송" onclick="CheckLogin()" /></p>
	</form>
</body>
</html>