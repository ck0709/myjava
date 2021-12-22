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
var mon = new Monster("오크전사",23820,1579);
var user = new Master("냥냥펀치",15783,2379);

mon.info();
user.info();

hr();
dw("전투 시작");
hr();
mon.hp = mon.hp - user.attack;
user.hp = user.hp - mon.attack;

mon.info();
user.info();