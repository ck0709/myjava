

public class Hello {

	public static void main(String[]args) {
	//js : var cat = new Cat();
		
		int random = (int)(Math.random() * 6 + 1);
		Cat cat = new Cat(
				"�߿���",
				random,
				"�ڸ��ȼ����",
				"������"				
				);
		cat.info();
	} 
		

}
