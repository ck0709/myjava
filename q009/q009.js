var random; // 변수
// 1 ~ n 까지 범위내에서 랜덤하게 숫자 하나 뽑아주는 애.
random = Math.floor(Math.random() * 6) + 1;

//todo 주사위 1 ~ 6 각각에 대해 이미지를 출력하기
document.write("<img class='dice' src='dice6_" + random + ".jpg'>");        


// document.write("<img class='dice' src='dice6_" + (Math.floor(Math.random() * 6) + 1) + ".jpg'>"); // 위에 다 지우고 이 코드 한줄로도 가능