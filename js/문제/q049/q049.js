function Cat(name,age,weight,family,color){
    this.name="";               //이름
    this.age=0;                 //나이
    this.weight=0;              //몸무게
    this.family="";                //종류(ex.코리안숏헤어)
    this.color="";                 //털색

    this.crying = function(){
        hr();
        dw("야옹");
        hr();
    }
}
var kitty = new Cat();
kitty.name = "키티";
kitty.age = "1살";
kitty.weight = "300g";
kitty.family = "코리안숏헤어";
kitty.color = "검둥이";

var yaongi = new Cat("나비","2살",500,"페르시아","흰둥이");
yaongi.name = "나비";
yaongi.age = "2살";
yaongi.weight = "500g";
yaongi.family = "페르시아";
yaongi.color = "흰둥이";
if(kitty.age>yaongi.age){
    dw("형님:"+kitty.name);br();
    dw("동생:"+yaongi.name);
}else if(kitty.age == yaongi.age){
    dw("둘은 친구임");
}else{
    dw("형님:"+yaongi.name);br();
    dw("동생:"+kitty.name);
}
kitty.crying();
// hr();
// dw("이름:"+kitty.name);
// br();
// dw("나이:"+kitty.age);
// br();
// dw("몸무게:"+kitty.weight);
// br();
// dw("종류:"+kitty.family);
// br();
// dw("털색:"+kitty.color);
// hr();

// dw("이름:"+yaongi.name);
// br();
// dw("나이:"+yaongi.age);
// br();
// dw("몸무게:"+yaongi.weight);
// br();
// dw("종류:"+yaongi.family);
// br();
// dw("털색:"+yaongi.color);