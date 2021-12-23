function Monster(name,hp,attack,exp){ 
    /* 속성, 프로퍼티 */
    this.name = name;  // 이름
    this.hp = hp;    // 현재체력
    this.maxhp = hp;    // 최대체력
    this.attack = attack; // 공격력
    this.exp = 100;       //경험치
    /* 멤버함수, 멤버메소드 */
    this.info = function(){
        dw("["+this.name+"("+this.hp + "/" + this.maxhp+")]");
    }
}