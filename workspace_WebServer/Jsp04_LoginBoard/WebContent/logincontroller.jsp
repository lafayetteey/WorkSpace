
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
<title>Insert title here</title>
</head>
<body>
	<%
	
	/*
	스코프( scope )
		1. page 영역 : pageContext객체
			JSP 파일에는 pageContext 객체가 내장 , 이 객체는 page 영역에시만 유효
		2. request 영역 : request객체
			요청을 받아서 응답하기 전까지 객체가 유효 , forward , include 사용하면 request 객체가 공유
	 	3. session 영역 : 	session 객체
	 		브라우저당 1개 
	 		request.getSession()
	 	4. application 영역 :  application 객체
			application 당 1개
			request.getServletContext() 메소드 사용하여 application 객체를 얻을 수 있다.
	*/
		String command = request.getParameter("command");
		System.out.println("[command : " +command+" ]");
		
		MyMemberDao dao = new MyMemberDao();
		
		if(command.equals("login") ) {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			MyMemberDto dto = dao.login(id , pw);
			if(dto.getMyid() != null) {			
				session.setAttribute("dto", dto);			
				//session 이 살아있는 시간을 설정 default: 30분
				session.setMaxInactiveInterval(60*60);
				
				if(dto.getMyrole().equals("ADMIN") ) {
					response.sendRedirect("adminmain.jsp");
				} else if (dto.getMyrole().equals("USER") ) {
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
		} else if(command.equals("logout") ){
			session.invalidate(); //세션 정보 삭제
			response.sendRedirect("index.jsp");
		} else if(command.equals("userlistall") ) {
			List<MyMemberDto> list = dao.selectAll();
			
			//리턴받은 회원정보를 userlistall에 뿌려줌
			request.setAttribute("list", list);
			pageContext.forward("userlistall.jsp");
			
		} else if(command.equals("userlistenabled")) {
			List<MyMemberDto> list = dao.selectEnabled();
			
			request.setAttribute("list", list);
			pageContext.forward("userlistenabled.jsp");
			
		} else if(command.equals("updateroleform") ) {
			int myno = Integer.parseInt(request.getParameter("myno") );
			
			MyMemberDto dto = dao.selectOne(myno);
			
			request.setAttribute("dto", dto);
			pageContext.forward("updateroleform.jsp");
			
					
		} else if(command.equals("updaterole") ) {
			int myno = Integer.parseInt(request.getParameter("myno") );
			String myrole = request.getParameter("myrole");
			
			int res = dao.updateRole(myno , myrole);
			
			if(res > 0 ){
%>
	<script type="text/javascript">
		alert("회원 등급 업데이트 완료");
		location.href="logincontroller.jsp?command=userlistenabled";
	</script>
<%			
			} else {
%>
	<script type="text/javascript">
		alert("회원 등급 업데이트 실패");
		location.href="logincontroller.jsp?command=updateroleform";
	</script>
<% 
			}
		} else if(command.equals("registform") ) {
			response.sendRedirect("registform.jsp");
			
		} else if(command.equals("idchk") ){
			String myid = request.getParameter("id");
			String res = dao.idChk(myid);
			boolean idnotused = true;
			
			//db에 이미 아이디가 존재하는 경우
			if(res != null ) {
				idnotused = false;	
			} 
			response.sendRedirect("idchk.jsp?idnotused="+idnotused);
		} else if(command.equals("insertuser") ) {
			String myid = request.getParameter("myid");
			String mypw = request.getParameter("mypw");
			String myname = request.getParameter("myname");
			String myaddr = request.getParameter("myaddr");
			String myphone = request.getParameter("myphone");
			String myemail = request.getParameter("myemail");
			
			MyMemberDto dto = new MyMemberDto();
			dto.setMyid(myid);
			dto.setMypw(mypw);
			dto.setMyname(myname);
			dto.setMyaddr(myaddr);
			dto.setMyphone(myphone);
			dto.setMyemail(myemail);
			
			int res = dao.insertUser(dto);
			if(res > 0 ) {
%>
	<script type="text/javascript">
		alert("회원 가입이 완료되었습니다.");
		location.href="index.jsp";
	</script>
<% 			
			} else {
%>
		<script type="text/javascript">
			alert("회원 가입 실패 ");
			location.href="logincontroller.jsp?command=registform";
		</script>
<% 		
			}
		}
		
	%>
</body>
</html>