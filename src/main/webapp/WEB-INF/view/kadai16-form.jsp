<%@page import="dto.Account16"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="dto.Account16"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>会員登録</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String errorCode = request.getParameter("error");
		if(errorCode != null && errorCode.equals("1")){
			Account16 ac = (Account16)session.getAttribute("input_data");
	%>
		<p style="color:red">登録に失敗しました。</p>
		<h3>新規会員登録</h3>
		<form action="Kadai16ConfirmServlet" method="post">
		名前：<input type="text" name="name"><br>
		年齢：<input type="text" name="age"><br>
		性別：<br>
		<label><input type="radio" name="gender" value="男">男</label>
		<label><input type="radio" name="gender" value="女">女</label><br>
		電話番号<input type="tel" name="tel" placeholder="080-xxxx-xxxx"><br>
		メールアドレス<input type="email" name="mail"><br>
		パスワード<input type="password" name="pw"><br>
		<input type="submit" value="登録">
		</form>
	<%
		} else {
	%>
		<h3>新規会員登録</h3>
		<form action="Kadai16ConfirmServlet" method="post">
		名前：<input type="text" name="name"><br>
		年齢：<input type="text" name="age"><br>
		性別：<br>
		<label><input type="radio" name="gender" value="男">男</label>
		<label><input type="radio" name="gender" value="女">女</label><br>
		電話番号<input type="tel" name="tel" placeholder="080-xxxx-xxxx"><br>
		メールアドレス<input type="email" name="mail"><br>
		パスワード<input type="password" name="pw"><br>
		<input type="submit" value="登録">
		</form>
	<%
	}
	%>
</body>
</html>