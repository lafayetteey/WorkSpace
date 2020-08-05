<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    <%response.setCharacterEncoding("text/html; charset=UTF-8"); %>
    
    <%@page import="com.my.dto.MyBoardDto" %>
    <%@page import="com.my.dao.MyBoardDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//1. myinser 의 form 태그에서 입력받은 text 값을 아래에서 받는다.
	String myname = request.getParameter("myname");
	String mytitle = request.getParameter("mytitle");
	String mycontent = request.getParameter("mycontent");
	
	//2. dto 객체 생성 후 해당 3개의 값을 받는다.
	MyBoardDto dto = new MyBoardDto(myname , mytitle , mycontent);
	
	//3. dao 객체 생성 후 3개의 값을 dao 클래스 메소드에 전달 해줌과 동시에 int 값에 결과를 저장한다
	MyBoardDao dao = new MyBoardDao();
	int res = dao.insert(dto);
	if(res > 0) {
%>
	<script type="text/javascript">
		alert("글 등록 성공")
		location.href="mylist.jsp";
	</script>
<%

	} else {
%>
	<script type="text/javascript">
		alert("글 등록 실패");
		location.href="myinser.jsp";
	</script>
<%
	}
%>
</body>
</html>