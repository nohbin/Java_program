package day3;

public class WearableComputer implements Wearable {

	@Override
	public void putIn() {
		System.out.println("웨어러블컴퓨터(?) 를 입다.");
		
	}

	@Override
	public void putOut() {
		System.out.println("웨어러블컴퓨터(?) 를 벗다.");
		
	}
	
	public void reset() {
		System.out.println("리셋 합니다.");
	}

}
