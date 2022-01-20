package q014;

public class Main {
	public static void main(String[]args) {
			Singleton obj1 = Singleton.getInstance();
			Singleton obj2 = Singleton.getInstance();

			System.out.println(System.identityHashCode(obj1));
			System.out.println(System.identityHashCode(obj2));
			
			if(obj1 == obj2){
				System.out.println("같은 Singleton 객체 입니다.");
			}else {
				System.out.println("다른 Singleton 객체 입니다.");
			}
	}
}