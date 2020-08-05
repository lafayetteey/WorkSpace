function test() {
    alert("외부 작성 방식");
    var doc = document.getElementsByTagName("li")[2];
    doc.style.backgroundColor="blue";
    doc.style.fontSize="30pt";
    doc.innerHTML="<b>글자가 이렇게 또 바뀜</b>"
}

window.onload=function(){
    alert("F5누르면 알림뜸");
}