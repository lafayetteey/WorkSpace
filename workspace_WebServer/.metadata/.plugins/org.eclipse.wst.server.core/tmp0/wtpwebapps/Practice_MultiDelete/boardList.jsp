<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    <%response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="com.multi.dto.MDBoardDto"%>
	<%@ page import="com.multi.dao.MDBoardDao" %>
	<%@ page import="java.util.List" %>
	
	<%
		MDBoardDao dao = new MDBoardDao();
		List<MDBoardDto> list = dao.selectAll();
	%>

	<h1>게 시 판</h1>
	<form action="muldel.jsp" method="post">
		<table border="1">
			<col width ="30px"><col width ="50px"><col width ="100px"><col width ="300px"><col width ="100px">
			<tr>
			<th><input type="checkbox" name="all" onclick="allChk(this.checked)"></th>
			<th>NO</th>
			<th>WRITER</th>
			<th>TITLE</th>
			<th>DATE</th>
			</tr>
				<tr>
					<td>----게시글이 없습니다.----</td>
				</tr>
		
		</table>
	</form>
</body>
</html>