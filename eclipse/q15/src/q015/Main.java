package q015;

public class Main {
	public static void main(String[]args) {
			Person p1 = new Person("123456-1234567","계백");
			
			
			System.out.println(p1.nation);
			System.out.println(p1.ssn);
			System.out.println(p1.name);
			
			p1.name = "을지문덕";
	}
}