function alertTest(){
    alert("내용 출력");
}
function confirmTest(){
    if(confirm("배경색을 분홍색으로 바꿀가요?")) {
        document.body.style.backgroundColor="pink";
    } else{
        alert("기본색상유지");
    }
}
function promptTest(){
    var txt = prompt("좋아하는 과목번호를 선택\n[1. 자바 2. DB 3. UI]");
    console.log(txt);

    switch(txt){
        case "1" : 
            alert("JAVA!!");
            break;
        case "2" :
            alert("DB!!");
            break;
        case "3" :
            alert("UI!!");
            break;
        case null :
            alert("choose you jackass!");
            break;
        default :
            alert("chose betweem 1,2,3");
            break;
    }
}