function func01(){
    alert("명시적 함수");
}

//익명함수(변수에 function을 추가)
var func02 =  function(){
    alert("익명함수");
}
//리터럴 함수 :(매개변수 처럼 function을 넘겨주는 함수)
function func03(){
    literalPrn(function(msg){
        alert(msg);

    });
}
function literalPrn(literal){
    literal("안녕하세요 리터럴입니다.");
}

//argumnet : argument 의 갯수만큼 배열형태로 들어오면 반복문을 통해 변수에 담고 출력한다.
function valTest(){
    var value="";
    for(var i=0; i<arguments.length; i++) {
        value += arguments[i]+" , ";
    }
    alert(value + " : " + typeof value);
}
function closuerTest(val){
    var msg = "입니다";
    function addVal() {
        alert(val + " " + msg);
    }
    return addVal;
}
function pmEdu(val){
    closuerTest(val)();
    //funtion 값을 사용하려면 () 을 붙여준다.
}

var sEdu = closuerTest("javaScript");