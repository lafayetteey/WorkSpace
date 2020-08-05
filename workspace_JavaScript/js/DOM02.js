 //id 가 area1인 div태그를 선택하여
 // 배경색은 노란색 , "<b>아이디로 접근</b>"
 function searchId(){
     var doc = document.getElementById("area1");
     doc.style.backgroundColor="yellow";
     doc.innerHTML="<b>아이디로 접근</b>";
 }
 function searchTagName(){
     var doc = document.getElementsByTagName("li");
     console.log("전달받은 li태그 수 : " + doc.length);
     
     var change = 50;
     for(var i in doc){
         doc[i].style.backgroundColor="rgb(130,200,"+change+")";
         change +=50;
     }
 }
 function searchName(){
     var doc = document.getElementsByName("hobby");

     var value="";
     for(var i=0; i<doc.length; i++) {
         if(doc[i].checked == true) {
             value += doc[i].value+ " 선택함<br>"
         }
     } 
     document.getElementById("area2").innerHTML=value;
 }