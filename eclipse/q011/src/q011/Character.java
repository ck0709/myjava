package q011;

public class Character {
	String name;
	int currentHp;
	int maxHp;
	int atk;

	public Character(String name, int currentHp, int maxHp, int atk) {
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
		System.out.print(s);						
	}
	int getRandomAtk() {
		int randomAtk = (int)(Math.random()*atk+1);
		return randomAtk; 
	}

}