while(1){
  var player = prompt ("가위 바위 보 중에 하나를 입력하세요 [EXIT:-1]")
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
  alert("유저:　　　"+player+"　　　　　컴:　　　"+com);
  switch(player){ 
    case "가위": 
    break; 
    case "바위": 
    break; 
    case "보": 
    break; 
    case"-1":
    break;
    default: 
    alert("잘못 입력하셨습니다"); 
  }
  if (player == com){
    alert("Draw");
  }
  if (player == "가위"){
    if (com == "바위"){
      alert("Lose");
    }else if (com == "보"){
      alert("Win");
    }
  }
  if (player == "바위"){
    if (com == "보"){
      alert("Lose");
    }else if (com == "가위"){
      alert("Win");
    }
  }
  if (player == "보"){
    if (com == "바위"){
      alert("Win");
    }else if (com == "가위"){
      alert("Lose");
    }
  }
  if (player == -1){
      alert("게임 종료");
      break;
  }
  }