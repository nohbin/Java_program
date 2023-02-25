package day3;

public class HeadPhone implements Wearable {

	@Override
	public void putIn() {
		System.out.println("Headphone 을 쓰다");
		
	}

	@Override
	public void putOut() {
		System.out.println("Headphone 을 벗다");
		
	}
	
	private int volume;
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int volumeUp() {
		return volume++;
	}
	
	
	

}
