package day2;

public class Adult extends Person{

	
	private static int count = 0;
	
	Adult(){
	count++;	
	}
	public static int getCount() {
		return count;
	}
	
	
	@Override
	public int getPrice() {
		
		return super.getPrice();
	}

	
	

}
