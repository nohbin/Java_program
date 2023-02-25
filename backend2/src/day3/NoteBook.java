package day3;

public class NoteBook extends Repair implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("노트북 을 실행합니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("노트북 을 종료합니다.");

	}
	
	@Override
	public void repair() {
		
		super.repair();
	}
	
	@Override
	void init() {
		// TODO Auto-generated method stub
		super.init();
	}
	

}
