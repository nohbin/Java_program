package day2;

public class Teenager extends Person{
	
private static int count = 0;
	
	Teenager(){
	count++;	
	}
	public static int getCount() {
		return count;
	}
	
	private static final double DISCOUNT = 0.35;
	@Override
	public int getPrice() {	
		return (int)(this.price * (1-DISCOUNT));
	}
	
	public int count() {
		return count;
		
	}

	
	
}
