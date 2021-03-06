/* 보상 획득 처리 */
function getReward() {
    elf.money = elf.money + orc.money;
    tv(orc.money + "원을 얻었습니다.\n");
}
/* 0~공격력 값을 리턴 */
function getRandomAttackValue(attack) {
    attack = attack + 1;    //ex. 공격력이 10이라고 하면 0~10의 수치로 나와야 하므로
    var random = Math.floor(Math.random() * attack);  // ex. 공격력이 11이고 이 랜덤처리를 하면 랜덤 값은 0~10이 나옴
    return random;
}
/* - 전투 종료 처리(종료메세지 출력, 경험치 획득) */
function endBattle() {
    tv("전투 종료\n");
    // 경험치 처리
    elf.exp = elf.exp + orc.exp;
    // - 전투 종료 후 경험치 획득 메세지 출력 ex. 불쌍한 토끼, 엠피스에게 경험치 100 을 주고 죽었습니다.
    tv("불쌍한 " + orc.name + ", " + elf.name + "에게 경험치 " + orc.exp + "을 주고 죽었습니다.\n");
    getReward();
    currentMode = "대기"; // 현재 턴 타입을 <대기>로 전환
    tvGameObjectClear();    // 게임 오브젝트 화면을 지움
}
/* 전투 턴 처리 */
function procBattleTurn() {
    // 공격 메세지 출력 추가( ex. 오크전사가 엠피스에게 데미지를 10 입혔습니다. )
    var monsterDamage = getRandomAttackValue(orc.attack);
    var playerDamage = getRandomAttackValue(elf.attack);

    orc.currentHp = orc.currentHp - playerDamage;
    tv(elf.name + "가 " + orc.name + "에게 데미지를 " + playerDamage + " 입혔습니다.\n");
    elf.currentHp = elf.currentHp - monsterDamage;
    tv(orc.name + "가 " + elf.name + "에게 데미지를 " + monsterDamage + " 입혔습니다.\n");

    // hp 검사하기
    if (elf.currentHp <= 0 || orc.currentHp <= 0) {
        displayCharactersInfo();
        endBattle();    // 전투 종료 처리
        return false;
    } else {
        displayCharactersInfo();
        return true;
    }
}
/* 턴 처리 */
function turn() {
    if (currentMode == "전투") {
        procBattleTurn();
    } else {
        procNormalTurn();
    }
    turnCount++;
    itTurn.value = turnCount;   // 현재 턴 표시
    console.log("현재 턴:" + turnCount);
}
/* 턴 처리 - 일반(비전투 상황 시의 턴 처리) */
function procNormalTurn() {
    tv("특별한 것은 보이지 않는다.\n");
}
/* 이동 처리 */
function move(direction) {  // direction : 방향 값 ex. '동','밑' 등
    var nowRoom = getCurrentRoomObject()
    var connectionRoomId = nowRoom.getIdByDirection(direction);
    if(connectionRoomId == 0){  // 갈수 없는 방향이면 ( 값 0 ) 갈수 없음 출력 후 함수를 빠져나감 ( return; )
        tv("갈수 없음\n");
        return;
    } else {
        currentRoomId = connectionRoomId;
        console.log("현재 방번호:"+currentRoomId);
    }

    switch (direction) {
        case "동":
            tv("동쪽으로 이동했습니다.\n");
            break;
        case "서":
            tv("서쪽으로 이동했습니다.\n");
            break;
        case "남":
            tv("남쪽으로 이동했습니다.\n");
            break;
        case "북":
            tv("북쪽으로 이동했습니다.\n");
            break;
        case "위":
            tv("위쪽으로 이동했습니다.\n");
            break;
        case "밑":
            tv("아래쪽으로 이동했습니다.\n");
            break;
    }
    /* 이동 후 할일들 */
    displayRoomInfo();  /* 방 정보 보여주기 */
    turn();             /* 턴 진행 */
}
/* 현재 방 id를 가지고 방 배열에서 해당 방 객체를 리턴 */
function getCurrentRoomObject() {
    for (var i = 0; i < roomArray.length; i++) {
        if (roomArray[i].id == currentRoomId) {
            return roomArray[i];
        }
    }
}
/* 현재 방에 있는 몬스터들을 배열로 리턴 */
function getCurrentRoomMonsters(){
    var currentRoomMonsters = new Array();  // 빈 배열 생성 (갯수 0개)
    for(var i=0;i<monsterArray.length;i++){
        if(monsterArray[i].location == currentRoomId){   // 몬스터 리스트의 id와 현재 방 id가 같으면 (즉, 현재 방에 있는 몬스터면)
            currentRoomMonsters.push(monsterArray[i]);  // 배열.push(배열에 넣을 변수) 하면 배열에 값이 추가로 들어감
        }
    }
    return currentRoomMonsters; // 현재 방에 있는 몬스터들을 찾아내서 배열로 만든 걸 리턴
}