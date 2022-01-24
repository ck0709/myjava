package test.data;

public class Menu {
	private String name;
	private String tel;
	private String sex;
	public Menu(String name, String tel, String sex) {
		this.name = name;
		this.tel = tel;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void info() {
		System.out.println("메뉴:"+name+ " 종류:"+ sex+" 가격:"+tel);
	}
	
}