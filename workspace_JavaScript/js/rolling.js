var num =1;

function nextGallery(){
    num++;
    if(num>5){
        num=1;
    }
    document.getElementById("gallery").src="image/img0"+num+".png";
}
function prevGallery(){
    num--;
    if(num<1){
        num=5;
    }
    document.getElementById("gallery").src="image/img0"+num+".png";
}