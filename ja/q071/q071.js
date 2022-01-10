var i;
var p;

function login(){
    alert("아이디: "+i.value+"\n"+"암호: "+p.value);
}


window.onload = function(){
    i=document.getElementById("i");
    p=document.getElementById("p");
}