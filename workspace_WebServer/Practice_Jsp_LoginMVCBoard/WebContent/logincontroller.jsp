<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    <%response.setContentType("text/html; charset=UTF-8"); %>
    
    <%@ page import="com.login.dao.MyMemberDao" %>
    <%@ page import="com.login.dto.MyMemberDto" %>
    <%@ page import="java.util.List" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Controller</title>
</head>
<%
	String command = request.getParameter("command");
	
	System.out.println("[commad : " + command + "]");
	
	MyMemberDao dao = new MyMemberDao();
	
		if(command.equals("login") ) {
			String id = request.getParameter("myid");
			String pw = request.getParameter("mypw");
			System.out.println("id , pw : " + id + pw);
			MyMemberDto dto = dao.login(id , pw); 
			
				if(dto.getMyid() != null ) {
					session.setAttribute("dto", dto);
					session.setMaxInactiveInterval(60*60);
					
					
					if(dto.getMyrole().equals("ADMIN")) {
						response.sendRedirect("adminmain.jsp");
					} else if(dto.getMyrole().equals("USER")) {
						response.sendRedirect("usermain.jsp");
					}
				} else {
%>
	<script type="text/javascript">
		alert("로그인 실패");
		location.href="index.jsp";
	</script>
<% 				
				}
		} else if(command.equals("logout")) {
			
			session.invalidate();
			response.sendRedirect("index.jsp");
			
		} else if (command.equals("userlistall") ) {
			List<MyMemberDto> list = dao.selectAll(); 
			
			request.setAttribute("list", list);
			pageContext.forward("userlistall.jsp");
				
		} else if(command.equals("userlistenabled") ) {
			List<MyMemberDto> list = dao.selectEnabled(); 
			
			request.setAttribute("list" , list);
			pageContext.forward("userlistenabled.jsp");
			
		} else if(command.equals("updateform") ) {
			int myno = Integer.parseInt(request.getParameter("myno") );
			
			MyMemberDto dto = dao.selectOne(myno); 
			
			request.setAttribute("dto", dto);
			pageContext.forward("updateroleform.jsp");
		} 
%>
<body>

</body>
</html>