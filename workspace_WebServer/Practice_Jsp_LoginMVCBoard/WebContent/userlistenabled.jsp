<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    <%response.setContentType("text/html; charset=UTF-8");%>
    
    <%@ page import="com.login.dto.MyMemberDto" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<%
		List<MyMemberDto> list = (List<MyMemberDto>)request.getAttribute("list");
	%>
<body>
		<table border="1">
		<col width="50"><col width="100"><col width="100">
		<col width="200"><col width="100"><col width="120">
			<tr>
				<th>NO</th>
				<th>ID</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>ROLE</th>
				<th>ROLE CHANGE</th>
			</tr>
			<!-- 변경 , 취소 -->
<%
	for(MyMemberDto dto : list) {
%>
	<tr>
		<td><%=dto.getMyno() %></td>
		<td><%=dto.getMyid() %></td>
		<td><%=dto.getMyname() %></td>
		<td><%=dto.getMyemail() %></td>
		<td><%=dto.getMyrole() %></td>
		<td colspan="1">
			<button onclick="location.href='logincontroller.jsp?command=updateform&myno=<%=dto.getMyno()%>' ">변경</button>
			<input type="button"  value="취소" onclick="location.href='adminmain.jsp' ">
		</td>
	</tr>
<% 		
	}
%>
		</table>
</body>
</html>