<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션값 받아오기</title>
</head>
<body>

<h2>세션값 받아오기</h2>
<%@ page contentType="text/html; charset=UTF-8" %>

<%

Date my_date = (Date)session.getAttribute("my_date");
String my_name = (String)session.getAttribute("my_name");
int my_age = (int)session.getAttribute("my_age");

out.println("날짜:"+ my_date + "<br>");
out.println("이름:"+ my_name + "<br>");
out.println("나이:"+ my_age + "<br>");
%>


</body>
</html>