var player = prompt ("가위 바위 보 중에 하나를 입력하세요")
var com = Math.floor(Math.random()*3+1);

if(com == 1){
  com = "가위";
}
if(com == 2){
  com = "바위";
}
if(com == 3){
  com = "보";
}
dw("유저:"+player);
br();
dw("컴:"+com);
br();
switch(player){ 
  case "가위": 
  break; 
  case "바위": 
  break; 
  case "보": 
  break; 
  default: 
  alert("잘못 입력하셨습니다"); 
}
if (player == com){
  dw("Draw");
}
if (player == "가위"){
  if (com == "바위"){
    dw("Lose");
  }else if (com == "보"){
    dw("Win");
  }
}
if (player == "바위"){
  if (com == "보"){
    dw("Lose");
  }else if (com == "가위"){
    dw("Win");
  }
}
if (player == "보"){
  if (com == "바위"){
    dw("Lose");
  }else if (com == "가위"){
    dw("Win");
  }
}