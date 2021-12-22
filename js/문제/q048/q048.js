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

var yaongi = new Cat();
yaongi.catName = "나비";
yaongi.catAge = "2살";
yaongi.catWeight = "500g";
yaongi.family = "페르시아";
yaongi.color = "흰둥이";
if(kitty.Age>yaongi){
    dw("형님:"+kitty.catName);br();
    dw("동생:"+yaongi.catName);
}else if(kitty.catAge == yaongi.catAge){
    dw("둘은 친구임");
}else{
    dw("형님:"+yaongi.catName);br();
    dw("동생:"+kitty.catName);
}
hr();
// dw("이름:"+kitty.catName);
// br();
// dw("나이:"+kitty.catAge);
// br();
// dw("몸무게:"+kitty.catWeight);
// br();
// dw("종류:"+kitty.family);
// br();
// dw("털색:"+kitty.color);
// hr();

// dw("이름:"+yaongi.catName);
// br();
// dw("나이:"+yaongi.catAge);
// br();
// dw("몸무게:"+yaongi.catWeight);
// br();
// dw("종류:"+yaongi.family);
// br();
// dw("털색:"+yaongi.color);