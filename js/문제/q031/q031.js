var player = prompt ("가위 바위 보 중에 하나를 입력하세요")
var com = Math.floor(Math.random()*3+1);
switch(player){ 
  case "가위": 
  dw("<img class='dice' src='game_3.jpg'>")
  break; 
  case "바위": 
  dw("<img class='dice' src='game_1.jpg'>")
  break; 
  case "보": 
  dw("<img class='dice' src='game_2.jpg'>")
  break;
  case"-1": 
  default: 
  alert("잘못 입력하셨습니다"); 
}
if(com == 1){
  com = "가위";
  dw("　　　　　　<img class='dice' src='game_3.jpg'>");
}
if(com == 2){
  com = "바위";
  dw("　　　　　　<img class='dice' src='game_1.jpg'>");
}
if(com == 3){
  com = "보";
  dw("　　　　　　<img class='dice' src='game_2.jpg'>");
}
br();
br();
dw("유저:　　"+player+"　　　　　　컴:　　"　　　　+com);
if (player == com){
  br();
  dw("　　　　　　<img class='dice' src='비김1.jpg'>");
}
if (player == "가위"){
  if (com == "바위"){
    br();
    dw("　　　　　　<img class='dice' src='패배1.jpg'>");
  }else if (com == "보"){
    br();
    dw("　　　　　　<img class='dice' src='승리1.jpg'>");
  }
}
if (player == "바위"){
  if (com == "보"){
    br();
    dw("　　　　　　<img class='dice' src='패배1.jpg'>");
  }else if (com == "가위"){
    br();
    dw("　　　　　　<img class='dice' src='승리1.jpg'>");
  }
}
if (player == "보"){
  if (com == "바위"){
    br();
    dw("　　　　　　<img class='dice' src='패배1.jpg'>");
  }else if (com == "가위"){
    br();
    dw("　　　　　　<img class='dice' src='승리1.jpg'>");
  }
}
