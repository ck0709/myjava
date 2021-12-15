// 얘를 1000번 하시오
// document.write("<img src='cat1.jpg'>");
    /* 6면체 */					
var random;					
random = Math.floor(Math.random() * 100) + 1; // 1 ~ n 까지 범위내에서 랜덤하게 숫자 하나 뽑아주는 애.					
	
// 반복문
//for ( 초기값 ; 조건 ; 증가식){
//	실행할 명령
// }
document.write("<div id='cat_flex'>")
for ( var a = 1 ; a < random ; a = a + 1 ){
	document.write("<div class='cat_box'>")
	document.write("<img class='cat' src='cat1.jpg'>")
	document.write("<p class='cat_number'> "+ a + "</p>")
	document.write("</div>")
	
}
document.write("</div>")