<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    <%response.setContentType("text/html; charset=UTF-8"); %>
    
    
    <%@ page import="com.mvc.dao.MVCBoardDao" %>
	<%@ page import="com.mvc.dto.MVCBoardDto" %>
	<%@ page import="java.util.List" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String command = request.getParameter("command");
	System.out.println("[command : " +command+" ]");
	
	MVCBoardDao dao = new MVCBoardDao();
	
	if(command.equals("boardList")) {
		List<MVCBoardDto> list = dao.selectAll();
		
		
		//allList 라는 이름에 list 객체를 담음
		request.setAttribute("allList", list);
		//allList를 boardList.jsp 페이지에서도 사용가능하게 forward를 해준다.
		pageContext.forward("boardList.jsp");
		/*
			페이지의 흐름을 제어 
			- 포워드 : request , response 가 유지 
			1) requestDispatcher
			2) <jsp:forward>
			3) pageContext.forward()

			- 리다이렉트 :  request , response 가 유지 되지 않고 새롭게 생성된다.
			response.sendRedirect()
		*/
		
	//List 에서 게시글 제목을눌렀을때	
	} else if(command.equals("boarddetail")) {
		int seq = Integer.parseInt(request.getParameter("seq"));
		
		MVCBoardDto dto = dao.selectOne(seq);
		
		request.setAttribute("select", dto);
		pageContext.forward("boarddetail.jsp");
		
	//리스트에서 글쓰기 버튼 눌렀을때
	} else if(command.equals("boardinsertform") ) {
		response.sendRedirect("boardinsert.jsp");
		
	//bpardinsert 에서 등록 submit을 눌렀을때	
	} else if(command.equals("boardinsert") ) {
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		MVCBoardDto dto = new MVCBoardDto();
		dto.setWriter(writer);
		dto.setTitle(title);
		dto.setContent(content);
		
		int res = dao.insert(dto);
		
		if(res > 0) {
%>
	<script type="text/javascript">
		alert("게시글 작성이 완료되었습니다.");
		location.href="mycontroller.jsp?command=boardList";
	</script>
<% 
		} else {
%>
	<script type="text/javascript">
		alert("게시글 등록 실패");
	</script>
<%
			response.sendRedirect("mycontroller.jsp?command=boardinsertform");
		}
		
	//boarddetail 에서 수정 버튼 눌렀을때
	} else if(command.equals("boardupdateform") ) {
		int seq = Integer.parseInt(request.getParameter("seq") );
		
		//받은 seq를 이용하여 selectOne 을 해준다.
		MVCBoardDto dto = dao.selectOne(seq);
		
		request.setAttribute("dto", dto);
		pageContext.forward("boardupdate.jsp");
	
	//boarddetail 에서 수정 완료버튼 눌렀을때
	} else if(command.equals("boardupdate") ){
		int seq = Integer.parseInt(request.getParameter("seq"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		MVCBoardDto dto = new MVCBoardDto();
		dto.setSeq(seq);
		dto.setTitle(title);
		dto.setContent(content);
		
		int res = dao.update(dto);
		if(res>0) {
%>
	<script type="text/javascript">
		alert("게시글 수정이 완료되었습니다.");
		location.href="mycontroller.jsp?command=boarddetail&seq="+<%=seq%>;
	</script>
	
<%
		} else {
%>
	<script type="text/javascript">
		alert("게시글 수정 실패");
		location.href="mycontroller.jsp?command=boardupdateform&seq="+<%=seq%>;
	</script>
	
<% 
		}
	} else if(command.equals("boarddelete") ) {
		int seq = Integer.parseInt(request.getParameter("seq") );
		
		int res = dao.delete(seq);
		
		if(res > 0) {
%>
	<script type="text/javascript">
		alert("게시글 삭제 성공")	
		location.href="mycontroller.jsp?command=boardList";
	</script>
<%
		} else {
%>
	<script type="text/javascript">
		alert("게시글 삭제 실패");
		location.href="mycontroller.jsp?command=boarddetail&seq="+<%=seq%>;
	</script>
<% 	
		}
	}
%>	
	
</body>
</html>