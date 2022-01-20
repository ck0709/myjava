package q011;

public class Main {

	public static void main(String[] args) {
		User elf = new User("엠피스", 100, 100, 10);
		Monster orc = new Monster("오크전사", 50, 50, 5);
		elf.info();
		orc.info();

		// 싸움
		int elfAtk = elf.getRandomAtk();
		int orcAtk = orc.getRandomAtk();
		orc.currentHp -= elfAtk;
		elf.currentHp -= orcAtk;
		System.out.println(elf.name + "가 " + orc.name + "에게 " 
				+ elfAtk + " 만큼 피해를 주었습니다.");
		System.out.println(orc.name + "가 " + elf.name + "에게 " 
				+ orcAtk + " 만큼 피해를 주었습니다.");

		elf.info();
		orc.info();
		
	}

}