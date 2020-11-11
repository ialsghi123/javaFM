<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습문제 4번</title>
</head>
<body>


<form action="MyServlet" method="POST">
<input type="radio" name="gender" value="남자">남자
<input type="radio" name="gender" value="여자">여자<br>
<input type="text" name="phone" size=20><br>
<input type="submit" value="확인">
</form>

웹 컨테이너 정보 : <%=application.getServerInfo() %><br>
서블릿 규약 버전 : <%=application.getMajorVersion() %>.
<%=application.getMinorVersion() %>


</body>
</html>