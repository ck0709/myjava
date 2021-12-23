var orc = new Monster("오크전사",100,10);
var elf = new Master("냥냥펀치",200,100);

displayCharactersInfo();

//전투 처리 ( 한 턴 <한차례의 서로간의 공격> )
//전투 시작 메세지
hr();
dw("　　　　　　　　――전투 시작――")
hr();

//전투 무한 루프 처리
var loop = true;
while(loop){
    loop = procBattleTurn();
}

hr();
function procBattleTurn(){
    // 공격 메세지 출력 추가( ex. 오크전사가 엠피스에게 데미지를 10 입혔습니다. )
    var monsterDamage = getRandomAttackValue(orc.attack);
    var playerDamage = getRandomAttackValue(elf.attack);
    
    orc.hp = orc.hp - playerDamage;
    dw(elf.name + "가 " + orc.name + "에게 데미지를 "+playerDamage +" 입혔습니다.<br>");
    elf.hp = elf.hp - monsterDamage;
    dw(orc.name + "가 " + elf.name + "에게 데미지를 "+monsterDamage +" 입혔습니다.<br>");
    
    
    displayCharactersInfo();

    //todo hp 검사하기
    if(elf.hp <= 0 || orc.hp <= 0){
        endBattle();
        displayCharactersInfo();
        return false;
    } else {
        displayCharactersInfo();
        return true;
    }
}


function getRandomAttackValue(attack){
    attack = attack + 1;    //ex. 공격력이 10이라고 하면 0~10의 수치로 나와야 하므로
    var random = Math.floor(Math.random()*attack);  // ex. 공격력이 11이고 이 랜덤처리를 하면 랜덤 값은 0~10이 나옴
    return random;
}
function endBattle(){
    dw("　　　　　　　　――전투 종료――");
    br();
    elf.exp = elf.exp + orc.exp;
    dw(elf.name + "가　" + orc.name + "를 처치하여 " + orc.exp + "exp를 회득하였습니다.");
    hr();
    dw(elf.name + "가　" + orc.name + "를 처치하여 " + "79골드를 회득하였습니다.");
}
function displayCharactersInfo(){
    hr();
    elf.info();
    orc.info();
    hr();
}

