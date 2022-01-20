package q011;

public class Monster {
	String name;
	int currentHp;
	int maxHp;
	int atk;
	public Monster(String name, int currentHp, int maxHp, int atk) {
		this.name = name;
		this.currentHp = currentHp;
		this.maxHp = maxHp;
		this.atk = atk;
	}
	void info() {
		String s =
				"[<" + name + ">"
				+ "(" + currentHp + "/" + maxHp + ")"
				+ "{atk:"+atk+"}]";
		System.out.println(s);						
	}
	int getRandomAtk() {
		int randomAtk = (int)(Math.random()*atk+1);
		return randomAtk; 
	}	
	
	
}