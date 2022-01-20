package chol;

public class Membe {
	
	String name;
	String sex;
	String tel;
	
	Membe(String name, String sex,String tel){
		this.name = name;
		this.sex = sex;
		this.tel = tel;
	}
	
	void info() {
		String s =
				"이름:"+name+"\n"
				+"성별:"+sex+"\n"
				+"전화번호:"+tel;
		System.out.println(s);
	}

}
