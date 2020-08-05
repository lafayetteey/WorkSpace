function searchId(){
    var doc = document.getElementById("test");
    doc.innerHTML="id로 탐색합니다.";
    doc.style.color="blue";
}
function searchName(){
    var doc = document.getElementsByName("test02");
    doc[1].value="name 속성으로 엘리먼트 검색";
}
function searchTagName(){
    var doc = document.getElementsByTagName("p");
    doc[4].innerHTML="<b>TagName으로 탐색</b>";
    doc[4].style.color="blue";
}