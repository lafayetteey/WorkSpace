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
	<h1>아두이노 LED 연결하기</h1>
	<form action="http://192.168.30.182/led.cgi" method="get"> 
		<p>
			GREEN
			<input type="radio" name="LEDstatus" value="1">On |<input type="radio" name="LEDstatus" value="0">Off
		</p>
		<input type="submit" value="전송">
	</form>
</body>
</html>