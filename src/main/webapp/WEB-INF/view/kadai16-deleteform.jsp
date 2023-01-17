<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String errorCode = request.getParameter("error");
		if(errorCode != null && errorCode.equals("1")){
	%>
		<p style="color: red;">削除に失敗しました。</p>
		<form action="Kadai16DeleteServlet" method="post">
		削除する会員名のメールアドレスを入力してください。<br>
		<input type="email" name="mail"><br>
		<input type="submit" value="削除">
		</form>
	<%
	} else {
	%>
		<form action="Kadai16DeleteServlet" method="post">
		削除する会員名のメールアドレスを入力してください。<br>
		<input type="email" name="mail"><br>
		<input type="submit" value="削除">
		</form>
	<%
	}
	%>
</body>
</html>