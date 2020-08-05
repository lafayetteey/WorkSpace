var variable = 10; //전역변수


function test01(){
    variable = variable+5;
    document.getElementById("v01").innerHTML="<b style='color:red; background:yellow;'>"+variable+"</b>";
}

function test02(){
    var variable2 = variable+100; //지역변수
    document.getElementById("v02").innerHTML="<b>"+variable2+"</b>";
}
function test03(){
    //String
    var variable3 ="문자";
    alert(variable3 + " : " + typeof variable3);
    //function
    variable3=function(){
        alert("객체 타입")
    }
    alert(variable3 + " : " + typeof variable3);
    variable3();

}