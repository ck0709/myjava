function Monster(name,hp,attack){
    this.name=name;
    this.hp=hp;
    this.attack=attack;

    this.info = function(){
        hr();
        dw("["+this.name+"][hp:　"+this.hp+"][atk:　"+this.attack+"]");
        hr();
    }
}
function Master(name,hp,attack){
    this.name=name;
    this.hp=hp;
    this.attack=attack;

    this.info = function(){
        hr();
        dw("["+this.name+"][hp:　"+this.hp+"][atk:　"+this.attack+"]");
        hr();
    }
}
var orc = new Monster("오크전사",200,10);
var elf = new Master("냥냥펀치",300,20);

orc.info();
elf.info();

hr();
dw("1라운드 시작");
hr();

var monsterDamage = getRandomAttackValue(orc.attack);
var playerDamage = getRandomAttackValue(elf.attack);

orc.hp = orc.hp - playerDamage;
dw(elf.name + "가 " + orc.name + "에게 데미지를 "+playerDamage +" 입혔습니다.<br>");
elf.hp = elf.hp - monsterDamage;
dw(orc.name + "가 " + elf.name + "에게 데미지를 "+monsterDamage +" 입혔습니다.<br>");

orc.info();
elf.info();

function getRandomAttackValue(attack){
    attack = attack + 1;  //ex.공격력이 10이라고 하면 0~10의 수치로 나와랴 하므로
    var random = Math.floor(Math.random()*attack); //ex. 공격력이 11이고 이랜덤처리를 하면 랜덤값은 0~10이 나옴
    return random;
}