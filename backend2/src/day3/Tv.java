package day3;

public class Tv extends Repair implements Controllable {
	
	public Tv() {}
	
	
	@Override
	public void turnOn() {
		System.out.println("Tv 를 실행합니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv 를 종료합니다.");
		
	}

	@Override
	public void repair() {
		
		System.out.println("Tv 수리를 시작합니다.");;
	}


	
	
	

}
