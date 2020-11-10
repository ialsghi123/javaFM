<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오늘 날짜와 시각 출력하기</title>
</head>
<body>
<h2>오늘 날짜와 시각 출력하기 예제</h2>

<%--

<%
	Date today = new Date();
	out.println(today);

%>
--%>

<form action="HelloServlet" method="post">
<input type="text" name="name">
<input type="submit" value="확인">
</form>   



</body>
</html>