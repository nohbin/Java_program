package day2;

public class Children extends Person {
	
private static int count = 0;
	
	Children(){
	count++;	
	}
	

	public static int getCount() {
		return count;
	}


	private static final double DISCOUNT = 0.85;
	
	@Override
	public int getPrice() {	
		return (int)(this.price * (1-DISCOUNT));
	}
	
	public int count() {
		return count;
		
	}

}
