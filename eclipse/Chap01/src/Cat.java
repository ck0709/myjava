public class Cat {
	/* 멤버 변수들 */
	String name;	//이름
	int age;		//나이
	String family;	//품종
	String color;	//털색
	
	/* 생성자 */
	Cat(String name, int age, String family, String color){
		this.name = name;
		this.age = age;
		this.family = family;
		this.color = color;
	}
	
	/* 멤버 함수들 */
	//js에서 함수선언 : var info = function(){ ... }	
	void info() {	//void : 리턴하지 않는다는 뜻
		String s =
				"이름:"+name+"\n"
				+"나이:"+age+"\n"
				+"품종:"+family+"\n"
				+"털색:"+color;
		System.out.println(s);
	}
}