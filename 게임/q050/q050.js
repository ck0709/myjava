function Monster(name,hp,attack){
    this.name=name;
    this.hp=hp;
    this.attack=attack;

    this.info = function(){
        hr();
        dw("["+name+"]　[hp:　"+hp+"]　[atk:　"+attack+"]");
        hr();
    }
}
function Master(name,hp,attack){
    this.name=name;
    this.hp=hp;
    this.attack=attack;

    this.info = function(){
        hr();
        dw("["+name+"]　[hp:　"+hp+"]　[atk:　"+attack+"]");
        hr();
    }
}
var mon = new Monster("오크전사",200,10);
var user = new Master("냥냥펀치",300,20);

mon.info();
user.info();