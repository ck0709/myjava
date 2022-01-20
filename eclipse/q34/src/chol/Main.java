package chol;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("**********회원목록**********");
		Member member = new Member();
		Membe membe = new Membe();
		
		member.setName("두부");
		member.setSex("남");
		member.setTel("010-1234-1234");
		
		membe.setName("콩이");
		membe.setSex("여");
		membe.setTel("010-1111-2222");
		
		member.info();
		membe.info();
			
	}
}
