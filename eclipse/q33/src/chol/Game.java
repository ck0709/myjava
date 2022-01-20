package chol;


public class Game {
	String cmd = "";
	public void start() {
		//케릭터 이름 입력
		Member.memberName = Command.getCommand(Str.CMD_GUIDE_CHARACTER_NAME_INPUT);
		//케릭터 성별 입력
		Member.memberSex = Command.getCommand(Str.CMD_GUIDE_CHARACTER_SEX_INPUT);
		//케릭터 직업 입력
		Member.memberTel = Command.getCommand(Str.CMD_GUIDE_CHARACTER_TEL_INPUT);
		//케릭터 정보 출력
		String s = String.format("당신의 이름은 %s 입니다~\n", Member.memberName);
		s += String.format("당신의 성별은 %s 입니다~\n", Member.memberSex);
		s += String.format("당신의 직업은 %s 입니다~", Member.memberTel);
		System.out.println(s);
	}
}
