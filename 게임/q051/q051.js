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
var mon = new Monster("오크전사",200,10);
var user = new Master("냥냥펀치",300,20);

mon.info();
user.info();

hr();
dw("1라운드 시작");
hr();
mon.hp = mon.hp - user.attack;
user.hp = user.hp - mon.attack;

mon.info();
user.info();