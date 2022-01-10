const LOGIN_ID = "cat";
const LOGIN_PW = "1234";

var i;
var p;

var id;
var pw;

function login(){
    id=i.value;
    pw=p.value;
    if(id == LOGIN_ID && pw == LOGIN_PW){
        alert("로그인 성공");
    } else {
        alert("로그인 실패");
    }
}

window.onload = function(){
    i=document.getElementById("i");
    p=document.getElementById("p");

}