function Cat(){
    this.catName="";               //이름
    this.catAge=0;                 //나이
    this.catWeight=0;              //몸무게
    this.family="";                //종류(ex.코리안숏헤어)
    this.color="";                 //털색
}
var kitty = new Cat();
kitty.catName = "키티";
kitty.catAge = "1살";
kitty.catWeight = "300g";
kitty.family = "코리안숏헤어";
kitty.color = "검둥이";

dw("이름:"+kitty.catName);
br();
dw("나이:"+kitty.catAge);
br();
dw("몸무게:"+kitty.catWeight);
br();
dw("종류:"+kitty.family);
br();
dw("털색:"+kitty.color);
hr();
