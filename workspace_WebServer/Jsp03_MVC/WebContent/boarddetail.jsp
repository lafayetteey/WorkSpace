<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    <%response.setContentType("text/html; charset=UTF-8"); %>
    
    <%@ page import="com.mvc.dto.MVCBoardDto" %>
    <%@ page import="com.mvc.dao.MVCBoardDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%MVCBoardDto dto = (MVCBoardDto)request.getAttribute("select"); %>
</head>
<body>
<h1>게시글 보기</h1>
	<!-- no writer date title content input buttox3 수정 삭제 목록 -->
	<div>
		<table border="1">
			<tr>
				<th>NO</th>
				<td><%=dto.getSeq() %>
			</tr>
			<tr>
				<th>WRITER</th>
				<td><%=dto.getWriter() %></td>
			</tr>
			<tr>
				<th>DATE</th>
				<td><%=dto.getRegdate() %>
			</tr>
			<tr>
				<th>TITLE</th>
				<td><%=dto.getTitle() %></td>
			</tr>
			<tr>	
				<th>CONTENT</th>
				<td>
					<textarea rows="10" cols="60" readonly="readonly"><%=dto.getContent() %></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="button" value="수정" onclick="location.href='mycontroller.jsp?command=boardupdateform&seq=<%=dto.getSeq()%>'">
					<input type="button" value="삭제" onclick="location.href='mycontroller.jsp?command=boarddelete&seq=<%=dto.getSeq()%>' ">
					<input type="button" value="목록" onclick="location.href='mycontroller.jsp?command=boardList&seq=<%=dto.getSeq()%>' ">
				</td>
			</tr>
		</table>
	</div>
</body>
</html>