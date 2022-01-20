package chol;

public class Membe {
	
	private String name;
	private String sex;
	private String tel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
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
