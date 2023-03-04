package solo;

public class VIP implements Grade{

	@Override
	public double reward(int price) {
		
		return price*VIP;
	}

	@Override
	public String toString() {
		return "VIP";
	}
	
	

}
