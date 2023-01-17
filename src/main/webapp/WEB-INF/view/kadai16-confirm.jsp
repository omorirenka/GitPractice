<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="dto.Account16" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>下記の内容で登録します。よろしいですか？</p>
	<%
		Account16 account = (Account16)session.getAttribute("input_dataK16");
	%>
	名前：<%= account.getName()%><br>
	年齢：<%= account.getAge()%><br>
	性別：<%= account.getGender()%><br>
	電話番号：<%= account.getTel()%><br>
	メール：<%= account.getMail()%><br>
	パスワード：********<br>
	<a href="Kadai16ExecuteServlet">OK</a><br>
</body>
</html>