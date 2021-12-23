function Monster(name,hp,attack){
    this.name=name;
    this.hp=hp;
    this.maxhp=hp;
    this.attack=attack;

    this.info = function(){
        dw("["+this.name+"("+this.hp + "/" + this.maxhp+")]");
    }
}
function Master(name,hp,attack){
    this.name=name;
    this.hp=hp;
    this.maxhp=hp;
    this.attack=attack;

    this.info = function(){
        dw("["+this.name+"("+this.hp + "/" + this.maxhp+")]");
    }
}
var orc = new Monster("오크전사",200,10);
var elf = new Master("냥냥펀치",300,20);

displayCharactersInfo();

dw("1라운드 시작");
hr();

var monsterDamage = getRandomAttackValue(orc.attack);
var playerDamage = getRandomAttackValue(elf.attack);

orc.hp = orc.hp - playerDamage;
dw(elf.name + "가 " + orc.name + "에게 데미지를 "+playerDamage +" 입혔습니다.<br>");
dw("냥냥펀치에게 데미지" + playerDamage + "를 입어 오크전사 hp가　" +orc.hp+"남앗습니다.<hr>");
elf.hp = elf.hp - monsterDamage;
dw(orc.name + "가 " + elf.name + "에게 데미지를 "+monsterDamage +" 입혔습니다.<br>");
dw("오크전사에게 데미지" + monsterDamage + "를 입어 냥냥펀치 hp가　" +elf.hp+"남앗습니다.");

displayCharactersInfo();

function getRandomAttackValue(attack){
    attack = attack + 1;  //ex.공격력이 10이라고 하면 0~10의 수치로 나와랴 하므로
    var random = Math.floor(Math.random()*attack); //ex. 공격력이 11이고 이랜덤처리를 하면 랜덤값은 0~10이 나옴
    return random;
}
function displayCharactersInfo(){
    hr();
    elf.info();
    orc.info();
    hr();
}