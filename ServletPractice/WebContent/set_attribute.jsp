<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션값 설정하기</title>
</head>
<body>
<h2>세션값 설정하기</h2>

<%@ page contentType="text/html; charset=UTF-8" %>

<%
session.setAttribute("my_date", new java.util.Date());
session.setAttribute("my_name", "Jimmy");
session.setAttribute("my_age", 10);
%>


</body>
</html>