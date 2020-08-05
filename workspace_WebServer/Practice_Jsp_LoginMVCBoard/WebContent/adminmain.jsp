<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8");%>
    <%response.setContentType("text/html; charset=UTF-8"); %>
    
    <%@ page import="com.login.dto.MyMemberDto" %>
<!DOCTYPE html>
<html>
<head>
	<%
		MyMemberDto dto = (MyMemberDto)session.getAttribute("dto");
	%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<span><%=dto.getMyrole() %> 님 환영 합니다. (등급 : <%=dto.getMyrole() %>)</span><br>
	<a href="logincontroller.jsp?command=logout" >로그아웃</a>
	
	<br>
	<hr>
	<div>
		<a href="logincontroller.jsp?command=userlistall">회원 정보 조회 (All)</a>
	</div>
	<div>
		<a href="logincontroller.jsp?command=userlistenabled">회원 정보 조회(ENABLED = "Y")</a>
	</div>
</body>
</html>