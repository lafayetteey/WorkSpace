function getParameterValues() {
	var name = "name="+$("#name").val();
	var kor = "kor="+$("#kor").val();
	var eng = "eng="+$("#eng").val();
	var math = "math="+$("#math").val();
	
	return "?"+name+"&"+kor+"&"+eng+"&"+math0
}

function load() {
	var url = "CalScore"+getparameterValues();
	
	httpRequest = new XMLHttpRequest();
	httpRequest.onreadystatechange=callback;
	httpRequest.open("GET" , url , true);
	httpRequest.send();
}
function callback() {
	alert("readyState : " + httpRequest.readyState);
	
	if(httpRequest.readyState == 4 ) {
		alert("status : " + httpRequest.status);
		
		if(httpRequest.status == 200) {
			var obj = JSON.parse(httpRequest.responseText);
			$("#result").html(obj.name+ " 의 총점은 " + obj.sum + " 이고 , 평균은 " + obj.avg + " 입니다.");
		} else {
			alert("데이터를 계산 할 수 없습니다.");
		}
	}
}
$(function () {
	$("#process").submit(function () {
		load();
	});
});