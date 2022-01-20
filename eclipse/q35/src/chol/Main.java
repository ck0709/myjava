package chol;



public class Main {
	
	public static void main(String[] args) {
		
		
		Member m1 = new Member("두부","남","010-1234-1234");
		Member m2 = new Member("콩이","여","010-1111-2222");
		
		m1.info();
		m2.info();
		m1.setName("콩이");
		m1.setSex("여");
		m1.setTel("010-1111-2222");
		m1.info();
		
		System.out.println("이름:"+m1.getName()
							+" 전번:"+m1.getTel()
							+" 성:"+m1.getSex());
	}

}
