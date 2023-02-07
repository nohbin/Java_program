package java_Rpg;

import java.util.Scanner;

public class RunGame {
	Scanner sc = new Scanner(System.in);
	boolean isGo = true;
	PlayGame pg = new PlayGame();
	Battle battle = new Battle(pg);
	Map map = new Map();

	void rungame() {

		System.out.println("RPG 의 시작");
		System.out.println("이름을 설정하세요 : ");
		pg.setName(sc.next());		
		while(isGo) {
		chooseJob();
		}
		chooseMap();
		battle.start();
	}

	public void chooseJob() {
		System.out.println("직업을 설정하세요 : (1 : 전사 2: 법사)");		
		pg.setJob(sc.nextInt());
		if(pg.getJob()==1) {
			System.out.println("전사를 선택하셨습니다.");
			isGo = false;
		}else if(pg.getJob()==2) {
			System.out.println("마법사를 선택하셨습니다.");
			isGo = false;
		}else 
			System.out.println("1번 혹은 2번을 입력하세요.");
	}
	
	public void chooseMap() {
		System.out.println("목적지를 설정하세요 : (1. 산 2: 강)");
		
	}
	
	

	

}
