package day3;

public class ControllableDemo {



	public static void main(String[] args) {

		Controllable tv = new Tv();
		Controllable notebook = new NoteBook();

		tv.turnOn();
		tv.turnOff();

		notebook.turnOff();
		notebook.turnOn();

		((Tv) tv).repair();

		Controllable a = new NoteBook();
		if (a instanceof NoteBook) {
			NoteBook b = (NoteBook) a;
		} else if (a instanceof Tv) {
			Tv b = (Tv) a;
		}

		Tv tv1 = new Tv();
		Controllable controllableTv = tv1;

		controllableTv.turnOn();
		controllableTv.turnOff();

		if (controllableTv instanceof Tv) {
			Tv tvObject = (Tv) controllableTv;
			tvObject.repair();
		}
		
		
		//익명클래스
		Controllable ct = new Controllable() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
		};
		
		

		// 다형성 : 다양한 형태로 존재, 부모타입으로 자식객체를 보관하는 기법
		// 사 용 : 부모와 자식이 같은 매소드를 가질떄(overRide 되었을 경우) 부모타입으로
		// 해당메소들르 호출하면 실 객체의 메소드가 자동으로 호출된다.(따로 타입캐스팅으로 변환)
		// 만약 실객체만 가지고 있는 메소드가 필요할때 해당 타입으로 캐스팅을 해줘야 하는데
		// 어떤 객체가 들어 있는지 모른다.

	}
}
